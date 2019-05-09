package com.example.a533.pratiqueexam2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activite2 extends AppCompatActivity {
Button btnAlert;
Button btnMoveToNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite2);

        btnAlert = findViewById(R.id.btnAlert);
        btnMoveToNext = findViewById(R.id.btnToActivity3);
        setListeners();
    }

    private void setListeners()
    {
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(Activite2.this);
                dialog.setContentView(R.layout.activity_dialog_layout);
                dialog.setTitle("Pleine puissance monsieur Sulu");


                Button button = dialog.findViewById(R.id.btnAyeCaptain);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("test", "test");
                        Toast.makeText(getApplicationContext(), "Vroom", Toast.LENGTH_SHORT).show();
                    }
                });

                Button buttonAnnuler = dialog.findViewById(R.id.btnAnnuler);
                buttonAnnuler.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("test", "test");
                        Toast.makeText(getApplicationContext(), "It’s treason then", Toast.LENGTH_SHORT).show();
                    }
                });


                dialog.show();
            }
        });

        btnMoveToNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity3.class);
                startActivity(intent);
            }
        });
    }
}
