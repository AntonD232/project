package com.example.calculateapp2;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.calculateapp2.databinding.ActivityMainBinding;
import com.example.calculateapp2.databinding.ActivitySecondBinding;

import java.util.Random;
import java.util.concurrent.ExecutionException;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    double result;
    public  int i, ii, iii = 0;
    int m, n, zadacha, rezhimi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.reshenie.setOnClickListener(v -> {
            srav();
        });
        binding.nazadd.setOnClickListener(v -> startNewActivity());
    }

    @Override
    protected void onResume() {
        super.onResume();
        resheniee();
        rezhim();
        schet();
    }

    int Rm(int min, int max) {
        int x;
        Random r = new Random();
        x = r.nextInt(max - min) + min;
        return x;
    }


    void rezhim() {
        Bundle argg = getIntent().getExtras();
        rezhimi = argg.getInt("5");
        switch (rezhimi) {
            case 1:
                timerrr(60000);
                break;
            case 2:
                timerrr(180000);
                break;
            case 3:
                timerrr(300000);
                break;
            case 4:
                i = 20;
                break;
            case 5:
                i = 50;
                break;
            case 6:
                i = 100;
                break;
            default:
                break;

        }
    }

    void timerrr(int milll) {
        CountDownTimer timerr = new CountDownTimer(milll, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                binding.obsh.setText("Время:" + String.valueOf(millisUntilFinished / 1000));
                binding.obsh.setTextColor(getColor(R.color.black));
            }

            @Override
            public void onFinish() {
                startNewActivity();
            }
        };
        timerr.start();
    }

    private void schet() {
        Bundle argg = getIntent().getExtras();
        rezhimi = argg.getInt("5");
        if(rezhimi>=4) {
            if (i > 0) {
                i--;
                binding.obsh.setTextColor(getColor(R.color.black));
                binding.obsh.setText("Осталось примеров: " + (i+1) );
            } else {
                startNewActivity();
            }
        }else if(rezhimi==0){
            i++;
            binding.obsh.setTextColor(getColor(R.color.black));
            binding.obsh.setText("решено примеров: " +(i-1));
        }
    }




    void resheniee() {
        Bundle arg = getIntent().getExtras();
        int slogS = arg.getInt("1");
        int vichS = arg.getInt("2");
        int umnS = arg.getInt("3");
        int delS = arg.getInt("4");
        while (true) {
            m = Rm(1, 10);
            n = Rm(1, 10);
            zadacha = Rm(1, 5);
            switch (zadacha) {
                case 1:
                    if (slogS == 1) {
                        result = m + n;
                        binding.priner.setText(m + "+" + n);
                        return;
                    } else if (slogS == 2) {
                        m *= m;
                        result = m + n;
                        binding.priner.setText(m + "+" + n);
                        return;
                    } else if (slogS == 3) {
                        m *= m;
                        n *= n;
                        result = m + n;
                        binding.priner.setText(m + "+" + n);
                        return;
                    }
                    break;
                case 2:
                    if (vichS == 1) {
                        binding.priner.setText(m + "-" + n);
                        result = m - n;
                        return;
                    } else if (vichS == 2) {
                        m *= m;
                        result = m - n;
                        binding.priner.setText(m + "-" + n);
                        return;
                    } else if (vichS == 3) {
                        m *= m;
                        n *= n;
                        result = m - n;
                        binding.priner.setText(m + "-" + n);
                        return;
                    }
                    break;
                case 3:
                    if (umnS == 1) {
                        result = m * n;
                        binding.priner.setText(m + "*" + n);
                        return;
                    } else if (umnS == 2) {
                        m *= m;
                        result = m * n;
                        binding.priner.setText(m + "*" + n);
                        return;
                    }
                    break;
                case 4:
                    if (delS == 1&& m%n==0) {
                        result = m / n;
                        binding.priner.setText(m + "/" + n);
                        return;
                    } else if (delS == 2 && m%n==0) {
                        m *= m;
                        result = m / n;
                        binding.priner.setText(m + "/" + n);
                        return;
                    }
                    break;

            }
        }

    }

    void srav() {
        double sum = Double.parseDouble(binding.edt.getText().toString());
        try {
            if (result == sum) {
                resheniee();
                ii++;
                schet();
                binding.prav.setText("Правильных:" + ii);
            } else {
                resheniee();
                iii++;
                schet();
                binding.neprav.setText("Неправильных:" + iii);
            }
        } catch (Exception e) {
            iii++;
        }
    }

    public void startNewActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}