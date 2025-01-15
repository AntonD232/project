package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class redActivity extends AppCompatActivity {
    private TextView otvet;
    private Button ok1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_red);
        otvet=findViewById(R.id.otvett);
        int resmes = MainActivity.ress;
        otvet.setText("правильный ответ:" + resmes);
        ok1=findViewById(R.id.button2);
        ok1.setOnClickListener(v -> okey(v));
    }
    public void okey(View v){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}