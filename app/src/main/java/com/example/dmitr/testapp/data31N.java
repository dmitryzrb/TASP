package com.example.dmitr.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

public class data31N extends AppCompatActivity {
    DatePicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.data31_n);
        Button ChangeNameButton = findViewById(R.id.next);
        final String name0 = intent.getStringExtra("name0");
        final String name01 = intent.getStringExtra("name01");
        final int slojno1 = intent.getIntExtra("slojno1",0);
        picker = findViewById(R.id.datePicker2);
        ChangeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(data31N.this, data31K.class);
                intent.putExtra("name0", name0);
                intent.putExtra("name01", name01);
                intent.putExtra("slojno1", slojno1);
                intent.putExtra("dataN", getDateFromDatePicker(picker).getTime());
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
