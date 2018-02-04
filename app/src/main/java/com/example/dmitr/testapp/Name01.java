package com.example.dmitr.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Name01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        final String name0 = intent.getStringExtra("name0");


        setContentView(R.layout.name01);
        Button ChangeNameButton = findViewById(R.id.dalee2);
        final EditText textView = findViewById(R.id.vvodimeni2);
        ChangeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Name01.this, Slojno1.class);
                intent.putExtra("name0", name0);
                String name01 = textView.getText().toString();
                intent.putExtra("name01", name01);
                startActivity(intent);
            }
        });
    }
}
