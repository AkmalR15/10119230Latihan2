package com.ar15.a10119230latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Tanggal Pengerjaan   : 24-April-2022
// Deskripsi Pengerjaan : -

// Nama                 : Akmal Rizqulloh
// NIM                  : 10119230
// Kelas                : IF-6
public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.register);
        textView.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(intent);
        });
    }
}