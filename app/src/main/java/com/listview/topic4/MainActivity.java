package com.listview.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lvCountry;
    String[] Country = {"Nepal","Kathmandu","India","New Delhi",
            "America", "Washington DC", "Canada","Ottawa", "UK","London"};
    private Map<String,String> Dictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCountry = findViewById(R.id.lvCountry);

        Dictionary = new HashMap<>();
        for(int i =0;i<Country.length;i+=2){
            Dictionary.put(Country[i],Country[i+1]);
        }

        ArrayAdapter adaptercountry = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
        new ArrayList<String>(Dictionary.keySet())
        );
        lvCountry.setAdapter(adaptercountry);

        lvCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String country = parent.getItemAtPosition(position).toString();
                String capital = Dictionary.get(country);

                Intent intent = new Intent(MainActivity.this,CapitalActivity.class);
                intent.putExtra("capital",capital);
                startActivity(intent);
                //Toast.makeText(MainActivity.this, capital, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
