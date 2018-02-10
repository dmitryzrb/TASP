package com.example.dmitr.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Interval2 extends AppCompatActivity {
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.interval2);
        final String name0 = intent.getStringExtra("name0");
        final String name01 = intent.getStringExtra("name01");
        final int slojno1 = intent.getIntExtra("slojno1",0);

        Button ChangeNameButton = findViewById(R.id.dalee4);
        ChangeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Interval2.this, Slojno1.class);
                int interval2 = getCount();
                intent.putExtra("name0", name0);
                intent.putExtra("name01", name01);
                intent.putExtra("slojno1", slojno1);
                intent.putExtra("interval2", interval2);
                startActivity(intent);
            }
        });
    }
    public int getCount(){
        if(checkBox5.isChecked()){
            return 1;
        }
        if(checkBox6.isChecked()){
            return 2;
        }
        if(checkBox7.isChecked()){
            return 3;
        }
        if(checkBox8.isChecked()){
            return 4;
        }

        return Integer.parseInt(editText2.getText().toString());
    }
}
