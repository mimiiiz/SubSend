package com.example.mimi.subsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class FreshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresh);
        setTitle("Fresh");

    }

    public void eggSub(View v){
        startActivity(new Intent(FreshActivity.this, EggSubActivity.class));
    }


}
