package com.example.calculateapp2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.calculateapp2.databinding.FragmentSecondBinding;

import java.util.Random;


public class SecondFragment extends Fragment {
    private int brown;
    double result;
    public int i, ii, iii = 0;
    int m, n, zadacha, rezhimi;
    private FragmentSecondBinding binding;
    CountDownTimer timerr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        brown = ContextCompat.getColor(requireContext(), R.color.brown);
        binding.reshenie.setOnClickListener(v -> {
            try {
                double sum = Double.parseDouble(binding.edt.getText().toString());
                if (result == sum) {
                    resheniee();
                    ii++;
                    schet();
                    binding.prav.setTextColor(brown);
                    binding.prav.setText("Правильных:" + ii);
                } else {
                    resheniee();
                    iii++;
                    schet();
                    binding.neprav.setText("Неправильных:" + iii);
                    binding.neprav.setTextColor(brown);
                }
            } catch (Exception e) {
                Toast.makeText(getContext(), "поле не должно быть пустым или иметь буквы", Toast.LENGTH_LONG).show();
            }

        });
        binding.nazadd.setOnClickListener(view -> nazadd());
        resheniee();
        rezhim();
        schet();
        binding.edt.setTextColor(brown);
        return binding.getRoot();
    }

    int RandomChislo(int min, int max) {
        int x;
        Random r = new Random();
        x = r.nextInt(max - min) + min;
        return x;
    }

    void rezhim() {
        rezhimi = getArguments().getInt("5");
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

    public void timerrr(int milll) {
        timerr = new CountDownTimer(milll, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                binding.obsh.setText("Время:" + (millisUntilFinished / 1000));
                binding.obsh.setTextColor(brown);
            }

            @Override
            public void onFinish() {
                nazadd();
            }
        };
        timerr.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        if (timerr != null) {
            timerr.cancel();
            timerr = null;
        }
    }

    private void schet() {
        rezhimi = getArguments().getInt("5");
        if (rezhimi >= 4 && rezhimi <= 6) {
            binding.obsh.setTextColor(brown);
            binding.obsh.setText("Осталось примеров: " + i);
            i--;
            if (i < 0) nazadd();
        } else if (rezhimi == 7) {
            binding.obsh.setTextColor(brown);
            binding.obsh.setText("решено примеров: " + i);
            i++;
        }
    }

    void resheniee() {
        int zad[] = getArguments().getIntArray("1");
        while (true) {
            m = RandomChislo(1, 10);
            n = RandomChislo(1, 10);
            zadacha = RandomChislo(1, 5);
            switch (zadacha) {
                case 1:
                    if (zad[0] > 0) {
                        if (zad[0] == 2) {
                            m *= m;
                        } else if (zad[0] == 3) {
                            m *= m;
                            n *= n;
                        }
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "+" + n);
                        result = m + n;
                        return;
                    }
                    break;
                case 2:
                    if (zad[1] > 0) {
                        if (zad[1] == 2) {
                            m *= m;
                        } else if (zad[1] == 3) {
                            m *= m;
                            n *= n;
                        }
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "-" + n);
                        result = m - n;
                        return;
                    }
                    break;
                case 3:
                    if (zad[2] > 0) {
                        if (zad[2] == 2)
                            m *= m;
                        result = m * n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "*" + n);
                        return;
                    }
                    break;
                case 4:
                    if (zad[3] > 0) {
                        if (zad[3] == 2)
                            m *= m;
                        result = (double) m / n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "/" + n);
                        return;
                    }
                    break;
            }
        }
    }

    void nazadd() {
        androidx.fragment.app.FragmentTransaction ft = getParentFragmentManager().beginTransaction();
        FirstFragment firstFragment = new FirstFragment();
        ft.replace(R.id.framell, firstFragment);
        ft.commit();
    }
}