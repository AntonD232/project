package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static int ress;
    private TextView primer, prav, neprav, bal;
    private Button reshit;
    private EditText rezult;
    private int one, two;
    public static int pr, ne, bl = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        primer = findViewById(R.id.textView);
        reshit = findViewById(R.id.button);
        prav = findViewById(R.id.pravView);
        bal = findViewById(R.id.ballView);
        neprav = findViewById(R.id.nepravView);
        rezult = findViewById(R.id.editText);
        reshit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b = Integer.parseInt(rezult.getText().toString());
                if (ress == b) {
                    Perevod(v);
                    pr+=1;
                    bl+=125;

                } else {
                    Perevodd(v);
                    ne+=1;
                    bl-=125;
                }
            }

        });
        Random r = new Random();
        one = r.nextInt(10 - 2) + 2;
        two = r.nextInt(10 - 2) + 2;
        primer.setText(one + "*" + two);
        ress = one * two;
        prav.setText("правильно:"+pr);
        neprav.setText("неправильно:"+ne);
        bal.setText("количество очков:"+bl);
    }

    public void Perevod(View v) {
        Intent intent = new Intent(this, zelActivity.class);
        startActivity(intent);
    }

    public void Perevodd(View v) {
        Intent intent = new Intent(this, redActivity.class);
        startActivity(intent);
    }
}