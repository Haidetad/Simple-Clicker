package com.example.simpleclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvCounter;
    Button btnClicker, btnReset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClicker = (Button) findViewById(R.id.btnClicker);

        tvCounter = (TextView) findViewById(R.id.tvCounter);

        btnReset = (Button) findViewById(R.id.btnReset);


        btnClicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue = tvCounter.getText().toString();

                int intCountValue = Integer.parseInt(countValue);
                intCountValue++;

                tvCounter.setText(String.valueOf(intCountValue));


            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue = tvCounter.getText().toString();
                int intCountValue = Integer.parseInt(countValue);
                intCountValue--;

                tvCounter.setText(String.valueOf(intCountValue));
            }
        });

    }
}
