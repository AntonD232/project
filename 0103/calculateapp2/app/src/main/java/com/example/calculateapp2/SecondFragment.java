package com.example.calculateapp2;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
            sravnenie();
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
            if (i > 0) {
                i--;
                binding.obsh.setTextColor(brown);
                binding.obsh.setText("Осталось примеров: " + (i + 1));
            } else {
                nazadd();
            }
        } else if (rezhimi == 7) {
            i++;
            binding.obsh.setTextColor(brown);
            binding.obsh.setText("решено примеров: " + (i - 1));
        }
    }

    void resheniee() {
        int slogS = getArguments().getInt("1");
        int vichS = getArguments().getInt("2");
        int umnS = getArguments().getInt("3");
        int delS = getArguments().getInt("4");
        while (true) {
            m = RandomChislo(1, 10);
            n = RandomChislo(1, 10);
            zadacha = RandomChislo(1, 5);
            switch (zadacha) {
                case 1:
                    if (slogS == 1) {
                        result = m + n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "+" + n);
                        return;
                    } else if (slogS == 2) {
                        m *= m;
                        result = m + n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "+" + n);
                        return;
                    } else if (slogS == 3) {
                        m *= m;
                        n *= n;
                        result = m + n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "+" + n);
                        return;
                    }
                    break;
                case 2:
                    if (vichS == 1) {
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "-" + n);
                        result = m - n;
                        return;
                    } else if (vichS == 2) {
                        m *= m;
                        result = m - n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "-" + n);
                        return;
                    } else if (vichS == 3) {
                        m *= m;
                        n *= n;
                        result = m - n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "-" + n);
                        return;
                    }
                    break;
                case 3:
                    if (umnS == 1) {
                        result = m * n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "*" + n);
                        return;
                    } else if (umnS == 2) {
                        m *= m;
                        result = m * n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "*" + n);
                        return;
                    }
                    break;
                case 4:
                    if (delS == 1 && m % n == 0) {
                        result = m / n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "/" + n);
                        return;
                    } else if (delS == 2 && m % n == 0) {
                        m *= m;
                        result = m / n;
                        binding.priner.setTextColor(brown);
                        binding.priner.setText(m + "/" + n);
                        return;
                    }
                    break;

            }

        }
    }

    void sravnenie() {
        double sum = Double.parseDouble(binding.edt.getText().toString());
        try {
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
            iii++;
        }
    }

    void nazadd() {
        androidx.fragment.app.FragmentTransaction ft = getParentFragmentManager().beginTransaction();
       FirstFragment firstFragment = new FirstFragment();
        ft.replace(R.id.framell, firstFragment);
        ft.commit();
    }
}