package com.example.dmitr.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class Data3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.data3);
        final String name0 = intent.getStringExtra("name0");
        final String name01 = intent.getStringExtra("name01");
        final int slojno1 = intent.getIntExtra("slojno1",0);
        final int interval2 = intent.getIntExtra("interval2",0);
        Button button = findViewById(R.id.button5);
        Button button_2 = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data3.this, data31N.class);
                intent.putExtra("name0", name0);
                intent.putExtra("name01", name01);
                intent.putExtra("slojno1", slojno1);
                intent.putExtra("interval2", interval2);
                startActivity(intent);



            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data3.this, FinalParam.class);
                intent.putExtra("name0", name0);
                intent.putExtra("name01", name01);
                intent.putExtra("slojno1", slojno1);
                intent.putExtra("interval2", interval2);
                startActivity(intent);
                intent.putExtra("data31N",-1);
                intent.putExtra("data31K",-2);


            }
        });
    }
}
