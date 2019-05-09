package com.example.a533.pratiqueexam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    Button btn0;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final CustomView customView = findViewById(R.id.customView1);
        customView.setOnSucessPasswordListener(new CustomView.OnSuccessPasswordListener() {
            @Override
            public void onSucessPassword() {
                Toast.makeText(getApplicationContext(), "NIBBA", Toast.LENGTH_SHORT).show();
            }
        });

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customView.setInput("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customView.setInput("1");
            }
        });
    }
}
