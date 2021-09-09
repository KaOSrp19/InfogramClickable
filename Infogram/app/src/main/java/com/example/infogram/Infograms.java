package com.example.infogram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Infograms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infograms);
    }
    public void goCreateAccount(View view){
        Intent intent = new Intent(Infograms.this,crear_cuenta.class);
        startActivity(intent);
    }
}
