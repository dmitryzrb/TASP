package com.example.dmitr.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.DragAndDropPermissions;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dmitr.testapp.data.AppDatabase;
import com.example.dmitr.testapp.data.Drug;

import java.util.List;

public class MainFragment extends Fragment {
    TextView textView;
    public MainFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View view =  inflater.inflate(R.layout.fragment_main, container, false);
            FloatingActionButton fab = (FloatingActionButton)  view.findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), Buttons3.class);
                    startActivity(intent);

                }
            });
            textView = view.findViewById(R.id.textView10);
            return view;
        }

        public void getData(){
            List<Drug> list = AppDatabase.getAppDatabase(getContext()).drugDao().getAll();
            if(list.size() > 0) {
                textView.setText(list.get(0).getFirstName());
            }
        }

    @Override
    public void onStart() {
        super.onStart();
        getData();
    }
}