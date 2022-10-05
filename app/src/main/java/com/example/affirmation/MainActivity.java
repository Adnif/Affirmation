package com.example.affirmation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.affirmation.adapter.adapter;
import com.example.affirmation.data.Datasource;
import com.example.affirmation.model.Affirmation;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter affirmationAdapter = new adapter(Datasource.affirmation,MainActivity.this);
        recyclerView.setAdapter(affirmationAdapter);
    }


}