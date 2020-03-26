package com.example.myandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;

    ArrayAdapter arrayAdapter;

    String fruits[] = {"apple","mango","grapes","papaya","pomogranite"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.my_list_view);

        arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_view_layout,fruits);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              //  Toast.makeText(ListViewActivity.this, "At position "+position+1, Toast.LENGTH_SHORT).show();
                String itemname = (String) parent.getItemAtPosition(position);
                Toast.makeText(ListViewActivity.this, itemname, Toast.LENGTH_SHORT).show();
            }
        });




    }
}
