package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class zelActivity extends AppCompatActivity {
    private Button ok1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zel);
        ok1=findViewById(R.id.button2);
        ok1.setOnClickListener(v -> okey(v));


    }
    public void okey(View v){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}