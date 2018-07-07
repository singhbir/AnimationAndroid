package com.bir.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void blink(View v)
    {
        ImageView imageView=findViewById(R.id.imgv);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        imageView.startAnimation(animation);
    }
    public void clockwise(View v)
    {
        ImageView imageView=findViewById(R.id.imgv);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        imageView.startAnimation(animation);
    }
    public void fade(View v)
    {
            ImageView imageView=findViewById(R.id.imgv);
            Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
            imageView.startAnimation(animation);

    }
    public void move(View v)
    {
        ImageView imageView=findViewById(R.id.imgv);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        imageView.startAnimation(animation);
    }
    public void slide(View v)
    {
        ImageView imageView=findViewById(R.id.imgv);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        imageView.startAnimation(animation);
    }
    public void zoom(View v)
    {
        ImageView imageView=findViewById(R.id.imgv);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        imageView.startAnimation(animation);
    }
}
