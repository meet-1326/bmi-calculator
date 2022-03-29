package com.raw.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    float cm,kg,m,ans,m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn;
        TextView tvcm,tvkg,tvans;

        tvcm = findViewById(R.id.tvcm);
        tvkg = findViewById(R.id.tvkg);
        tvans = findViewById(R.id.tvans);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DecimalFormat d = new DecimalFormat("0.##");

                cm = Float.parseFloat(tvcm.getText().toString());
                kg = Float.parseFloat(tvkg.getText().toString());

                if(cm == 0){
                    Toast.makeText(MainActivity.this, "Enter Centimeters", Toast.LENGTH_SHORT).show();
                }else if(kg == 0){
                    Toast.makeText(MainActivity.this, "Enter Kilograme", Toast.LENGTH_SHORT).show();
                }else{
                    m = cm/100;
                    m2 = m*m;
                    ans = kg/m2;
                    tvans.setText(""+ans);
                }
            }
        });

    }
}