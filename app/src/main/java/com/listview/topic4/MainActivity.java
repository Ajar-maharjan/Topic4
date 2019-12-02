package com.listview.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvCountry;
    String[] Country = {"Nepal", "America", "Canada", "Sweden",
            "Waganda" , "Russia", "Australia", "India" , "korea" ,
            "China", "Japan", "Indonesia", "Germany", "Brazil",
            "Africa" ,"Somalia", "Dubai", "Romania", "Portugal",
            "Argentina"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCountry = findViewById(R.id.lvCountry);

        ArrayAdapter adaptercountry = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Country);
        lvCountry.setAdapter(adaptercountry);
    }
}
