package com.abhilash.abhi.quickdeal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class FullscreenActivity extends Activity implements View.OnClickListener {
    ImageView i1;
    ImageView i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
 i1=(ImageView) findViewById(R.id.i1);
        i2=(ImageView) findViewById(R.id.i2);
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
      switch(view.getId())
      {
          case R.id.i1:
              Intent i3=new Intent(this,Buyer.class);
              startActivity(i3);
              break;
          case R.id.i2:
              Intent i4=new Intent(this,Seller.class);
              startActivity(i4);
              break;
      }
    }
}