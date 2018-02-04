package com.example.dmitr.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Name0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name0);
        Button ChangeNameButton = findViewById(R.id.dalee);
        final EditText textView = findViewById(R.id.vvodimeni);
        ChangeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Name0.this, Name01.class);
                intent.putExtra("name0", textView.getText().toString());
                startActivity(intent);
            }
        });
    }
}
