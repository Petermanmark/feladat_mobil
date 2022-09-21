package com.example.feladat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button nagyb;
    private Button kisb;
    private Button veletlensz;
    private EditText editTextBemenet;
    private TextView textViewKimenet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        nagyb.setOnClickListener(view -> {
            String seged = "";
            seged = editTextBemenet.getText().toString();
            textViewKimenet.setText(seged.toUpperCase());
        });

        kisb.setOnClickListener(view -> {
            String seged = "";
            seged = editTextBemenet.getText().toString();
            textViewKimenet.setText(seged.toLowerCase());
        });

        veletlensz.setOnClickListener(view -> {
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            textViewKimenet.setBackgroundColor(color);
        });

    }

    private void init() {
        nagyb = findViewById(R.id.nagybetus);
        kisb = findViewById(R.id.kisbetus);
        veletlensz = findViewById(R.id.veletlenszin);
        editTextBemenet = findViewById(R.id.editTextBemenet);
        textViewKimenet = findViewById(R.id.textViewKimenet);
    }
}