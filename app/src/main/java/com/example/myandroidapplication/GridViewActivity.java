package com.example.myandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {

    GridView gridView;
    int images[] = {R.drawable.logo1, R.drawable.logo2, R.drawable.logo3, R.drawable.logo4, R.drawable.logo5, R.drawable.logo6};
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = findViewById(R.id.my_grid_view);

        adapter = new CustomAdapter(getApplicationContext(),images);

        gridView.setAdapter(adapter);




    }
}
