package com.abhilash.abhi.quickdeal;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import com.abhilash.abhi.quickdeal.R;


public class Splash extends Activity {
    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent i = new Intent(Splash.this,FullscreenActivity.class);
                                          startActivity(i);
                                          finish();
                                      }
                                  },SPLASH_TIME_OUT);
    }
}


