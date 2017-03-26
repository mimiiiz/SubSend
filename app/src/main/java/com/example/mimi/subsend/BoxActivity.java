package com.example.mimi.subsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box);
    }

    public void gotoMain(View v){
        startActivity(new Intent(BoxActivity.this, MainActivity.class));
    }
}
