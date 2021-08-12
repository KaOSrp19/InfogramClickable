package com.example.infogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Infograms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infograms);
    }
    public void goCreateAccount(View view){
        System.out.println("____________________> go to vreate account");
    }
}
