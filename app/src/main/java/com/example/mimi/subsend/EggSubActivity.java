package com.example.mimi.subsend;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class EggSubActivity extends AppCompatActivity {

    TextView edittext;
    ImageView btn_date;
    int year_x, month_x, day_x;
    static final int DIALOG_ID = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg_sub);
        edittext = (TextView) findViewById(R.id.et_date);
        final Calendar calendar = Calendar.getInstance();
        year_x = calendar.get(Calendar.YEAR);
        month_x = calendar.get(Calendar.MONTH);
        day_x = calendar.get(Calendar.DAY_OF_MONTH);
        showDialogBtnOnClick();
    }

    public void showDialogBtnOnClick(){
        btn_date = (ImageView) findViewById(R.id.btn_date);
        btn_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);

            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id){
        if (id == DIALOG_ID){
            return new DatePickerDialog(this, dPickerListener, year_x, month_x, day_x);
        }
        return null;

    }

    private DatePickerDialog.OnDateSetListener dPickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
             year_x = year;
            month_x = month +1;
            day_x = dayOfMonth;

            edittext.setText(day_x+"/"+month_x+"/"+year_x);
        }
    };

    public void gotoMain(View v){
        startActivity(new Intent(EggSubActivity.this, MainActivity.class));
        Toast.makeText(this, "Success !", Toast.LENGTH_SHORT).show();
    }


}
