package com.example.dmitr.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Slojno1 extends AppCompatActivity {
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        final String name0 = intent.getStringExtra("name0");
        final String name01 = intent.getStringExtra("name01");



        setContentView(R.layout.slojno1);
        Button ChangeNameButton = findViewById(R.id.dalee3);
        checkBox1 = findViewById(R.id.checkBox7);
        ChangeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Slojno1.this, Data3.class);
                int slojno1 = getCount();
                intent.putExtra("name0", name0);
                intent.putExtra("name01", name01);
                intent.putExtra("slojno1", slojno1);

                startActivity(intent);
            }
        });
    }
    public int getCount(){
        if(checkBox1.isChecked()){
            return 1;
        }
        if(checkBox2.isChecked()){
            return 2;
        }
        if(checkBox3.isChecked()){
            return 3;
        }
        if(checkBox4.isChecked()){
            return 4;
        }

       return Integer.parseInt(editText.getText().toString());
    }
}
