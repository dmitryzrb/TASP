package com.example.dmitr.testapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dmitr.testapp.data.AppDatabase;
import com.example.dmitr.testapp.data.Drug;

public class FinalParam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalparam);
        Button ChangeNameButton = findViewById(R.id.finalbutt);
        TextView firstName = findViewById(R.id.textView4);
        ChangeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drug drug = new Drug();
                drug.setFirstName("firstname");
                drug.setLastName("lastname");
                AppDatabase.getAppDatabase(getApplicationContext()).drugDao().insertAll(drug);
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
