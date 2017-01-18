package com.example.mimi.subsend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class EatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eating);


        ImageView imgBtn_foremost = (ImageView) findViewById(R.id.img_foremost);
        ImageView imgBtn_catchup = (ImageView) findViewById(R.id.img_catchup);

        Glide.with(EatingActivity.this).load(R.drawable.foremost).into(imgBtn_foremost);
        Glide.with(EatingActivity.this).load(R.drawable.catchup).into(imgBtn_catchup);

    }


}
