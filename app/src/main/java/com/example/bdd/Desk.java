package com.example.bdd;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

class Desk {
    private int id;
    private byte[] img;
    private SurfaceHolder surfaceHolder;

    Desk(int id){
        this.id = id;
        Canvas canvas = surfaceHolder.lockCanvas();
    }

    public void setImg(Canvas canvas){;}
    public byte[] getImg(){
        return this.img;
    }
    public void paint(){}
}
