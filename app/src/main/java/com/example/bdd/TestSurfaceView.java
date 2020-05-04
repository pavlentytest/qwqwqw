package com.example.bdd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.ArrayList;

public class TestSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private DrawThread drawThread;
    public TestSurfaceView(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        drawThread = new DrawThread(getContext(), getHolder());
        drawThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        // изменение размеров SurfaceView
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        drawThread.requestStop();
        boolean retry = true;
        while (retry) {
            try {
                drawThread.join();
                retry = false;
            } catch (InterruptedException e) {
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        drawThread.add_xy((int)event.getX(), (int)event.getY());
        return super.onTouchEvent(event);
    }
}

class DrawThread extends Thread {
    int MAX_W = 2000, MAX_H = 3000;
    int[][] xy = new int[MAX_W][MAX_H];
    public void add_xy(int x, int y){
        this.xy[x][y] = 1;
    }

    private SurfaceHolder surfaceHolder;
    private volatile boolean running = true;//флаг для остановки потока

    public DrawThread(Context context, SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
    }

    public void requestStop() {
        running = false;
    }

    @Override
    public void run() {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        while (running) {
            Canvas canvas = surfaceHolder.lockCanvas();
            if (canvas != null) {
                try {
                    canvas.drawColor(Color.WHITE);
                    for(int i = 0; i<canvas.getWidth(); i++)
                        for (int j = 0; j<canvas.getHeight(); j++)
                            if (xy[i][j] == 1)
                                canvas.drawCircle(i, j, 10, paint);

                } finally {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
