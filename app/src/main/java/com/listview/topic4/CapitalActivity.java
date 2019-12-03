package com.listview.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CapitalActivity extends AppCompatActivity {

    TextView tvCapital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);

        tvCapital = findViewById(R.id.tvCapital);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null)
        {
            String message = bundle.getString("capital");
            tvCapital.setText(message);
        }


    }
}
