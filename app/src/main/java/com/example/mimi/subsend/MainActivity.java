package com.example.mimi.subsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoFresh(View v){
        startActivity(new Intent(MainActivity.this, FreshActivity.class));
    }

    public void gotoBox(View v){
        startActivity(new Intent(MainActivity.this, BoxActivity.class));
    }


}
