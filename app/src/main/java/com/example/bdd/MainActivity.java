package com.example.bdd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(new TestSurfaceView(this));
        /*
        setContentView(R.layout.painting);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.stars));

         */
/*
        User user = new User(0);
        user.addToGroup(0);
        user.getGroup(0).addDesk();
        user.getGroup(0).paintDesk(0);

 */
    }
}
