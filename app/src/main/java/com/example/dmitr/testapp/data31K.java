package com.example.dmitr.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

public class data31K extends AppCompatActivity {
    DatePicker picker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
Intent intent = getIntent();
        Date date = new Date(intent.getLongExtra("dataN", 0));

        setContentView(R.layout.activity_data31_k);
        Button ChangeNameButton = findViewById(R.id.next2);
        picker = findViewById(R.id.datePicker2);
        ChangeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(data31K.this, FinalParam.class);
                intent.putExtra("dataK", getDateFromDatePicker(picker).getTime());
                startActivity(intent);
            }
        });
    }
    public static java.util.Date getDateFromDatePicker(DatePicker datePicker){
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year =  datePicker.getYear();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        return calendar.getTime();
    }
}
