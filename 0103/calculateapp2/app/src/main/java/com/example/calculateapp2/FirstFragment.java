package com.example.calculateapp2;


import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.example.calculateapp2.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    int slogS, vichS, umnS, delS;
    int rezhim ;
    boolean x1isButtonPressed, xx1isButtonPressed, xxyyisButtonPressed, x3isButtonPressed, xx3isButtonPressed;
    boolean x2isButtonPressed, xx2isButtonPressed, xxyy2isButtonPressed, x4isButtonPressed, xx4isButtonPressed;
    boolean slogisButtonPressed, vichisButtonPressed, ymnisButtonPressed, delhisButtonPressed;
    boolean onem, threeM, fivem, svobm, dvap, fivep, stop;
    private int pitchh;
    private int pitch;
    private int whiteplus;
    private int blue;

    private FragmentFirstBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        pitchh = ContextCompat.getColor(requireContext(), R.color.greend);
        pitch = ContextCompat.getColor(requireContext(), R.color.greenwh);
        whiteplus = ContextCompat.getColor(requireContext(), R.color.brown);
        binding.en.setOnClickListener(view -> language(true));
        binding.ru.setOnClickListener((v -> language(false)));
        binding.slog.setOnClickListener((v -> plus()));
        binding.vich.setOnClickListener((v -> minus()));
        binding.ymn.setOnClickListener((v -> umnozenie()));
        binding.del.setOnClickListener((v -> delenie()));
        rezhim();
        binding.start.setOnClickListener(view -> {
            SecondFragment secondFragment = new SecondFragment();
            Bundle args = new Bundle();
            args.putInt("1", slogS);
            args.putInt("2", vichS);
            args.putInt("4", delS);
            args.putInt("3", umnS);
            args.putInt("5", rezhim);
            secondFragment.setArguments(args);
            androidx.fragment.app.FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            if ((slogS != 0 || vichS != 0 || delS != 0 || umnS != 0) && rezhim != 0)
                ft.replace(R.id.framell, secondFragment);
            ft.commit();
        });
        return binding.getRoot();
    }

    void rezhim() {
        binding.onemin.setOnClickListener(v -> {
            toggleButtonState(binding.onemin, onem);
            finalupdate(binding.threemin,binding.threemin,binding.fivemin,binding.dvadprim,binding.piatprim,binding.stoprim);
            rezhim =  1;
        });
        binding.threemin.setOnClickListener(v -> {
            toggleButtonState(binding.threemin, threeM);
            finalupdate(binding.onemin,binding.fivemin,binding.fivemin,binding.dvadprim,binding.piatprim,binding.stoprim);
            rezhim = 2;
        });
        binding.fivemin.setOnClickListener(v -> {
            toggleButtonState(binding.fivemin, fivem);
            finalupdate(binding.onemin,binding.threemin,binding.svob,binding.dvadprim,binding.piatprim,binding.stoprim);
            rezhim =  3;
        });
        binding.svob.setOnClickListener(v -> {
            toggleButtonState(binding.svob, svobm);
            finalupdate(binding.onemin,binding.threemin,binding.fivemin,binding.dvadprim,binding.piatprim,binding.stoprim);
            rezhim =  7;
        });
        binding.dvadprim.setOnClickListener(v -> {
            toggleButtonState(binding.dvadprim, dvap);
            finalupdate(binding.onemin,binding.threemin,binding.fivemin,binding.svob,binding.piatprim,binding.stoprim);
            rezhim = 4;
        });
        binding.piatprim.setOnClickListener(v -> {
            toggleButtonState(binding.piatprim, fivep);
            finalupdate(binding.onemin,binding.threemin,binding.fivemin,binding.svob,binding.dvadprim,binding.stoprim);
            rezhim =  5;
        });
        binding.stoprim.setOnClickListener(v -> {
            toggleButtonState(binding.stoprim, stop);
            finalupdate(binding.onemin,binding.threemin,binding.fivemin,binding.svob,binding.dvadprim,binding.piatprim);
            rezhim =  6;
        });
    }
    void finalupdate(Button button1,Button button2,Button button3,Button button4,Button button5,Button button6){
        updateButtonStates(button1);
        updateButtonStates(button2);
        updateButtonStates(button3);
        updateButtonStates(button4);
        updateButtonStates(button5);
        updateButtonStates(button6);
    }


    private boolean updateButtonStates(Button button) {
        button.setBackgroundColor(pitch);
        return false;
    }

    private void toggleButtonState(Button button, boolean isPressed) {
        isPressed = !isPressed;
        if (isPressed) {
            button.setBackgroundColor(pitchh);
        } else {
            button.setBackgroundColor(pitch);
        }
    }



    void plus() {
        slogisButtonPressed = !slogisButtonPressed;
        x1isButtonPressed = updateButtonStates(binding.xy1);
        xx1isButtonPressed = updateButtonStates(binding.xxy1);
        xxyyisButtonPressed = updateButtonStates(binding.xxyy1);
        if (slogisButtonPressed) {
            binding.slog.setBackgroundColor(pitchh);
            binding.xy1.setOnClickListener((v -> {
                toggleButtonState(binding.xy1, x1isButtonPressed);
                xx1isButtonPressed = updateButtonStates(binding.xxy1);
                xxyyisButtonPressed = updateButtonStates(binding.xxyy1);
                slogS =  1;
            }));
            binding.xxy1.setOnClickListener((v -> {
                toggleButtonState(binding.xxy1, xx1isButtonPressed);
                x1isButtonPressed = updateButtonStates(binding.xy1);
                xxyyisButtonPressed = updateButtonStates(binding.xxyy1);
                slogS = 2;
            }));
            binding.xxyy1.setOnClickListener((v -> {
                toggleButtonState(binding.xxyy1, xxyyisButtonPressed);
                x1isButtonPressed = updateButtonStates(binding.xy1);
                xx1isButtonPressed = updateButtonStates(binding.xxy1);
                slogS =  3;
            }));

        } else {
            binding.slog.setBackgroundColor(pitch);
            binding.xy1.setOnClickListener(v -> {
            });
            binding.xxy1.setOnClickListener(v -> {
            });
            binding.xxyy1.setOnClickListener(v -> {
            });
            slogS = 0;
        }
    }

    void minus() {
        vichisButtonPressed = !vichisButtonPressed;
        x2isButtonPressed = updateButtonStates(binding.xy2);
        xx2isButtonPressed = updateButtonStates(binding.xxy2);
        xxyy2isButtonPressed = updateButtonStates(binding.xxyy2);
        if (vichisButtonPressed) {
            binding.vich.setBackgroundColor(pitchh);
            binding.xy2.setOnClickListener((v -> {
                toggleButtonState(binding.xy2, x2isButtonPressed);
                xx2isButtonPressed = updateButtonStates(binding.xxy2);
                xxyy2isButtonPressed = updateButtonStates(binding.xxyy2);
                vichS =  1;
            }));
            binding.xxy2.setOnClickListener((v -> {
                toggleButtonState(binding.xxy2, xx2isButtonPressed);
                x2isButtonPressed = updateButtonStates(binding.xy2);
                xxyy2isButtonPressed = updateButtonStates(binding.xxyy2);
                vichS = 2;
            }));
            binding.xxyy2.setOnClickListener((v -> {
                toggleButtonState(binding.xxyy2, xxyy2isButtonPressed);
                x2isButtonPressed = updateButtonStates(binding.xy2);
                xx2isButtonPressed = updateButtonStates(binding.xxy2);
                vichS = 3;
            }));

        } else {
            binding.vich.setBackgroundColor(pitch);
            binding.xy2.setOnClickListener(v -> {
            });
            binding.xxy2.setOnClickListener(v -> {
            });
            binding.xxyy2.setOnClickListener(v -> {
            });
            vichS = 0;
        }

    }

    void umnozenie() {
        ymnisButtonPressed = !ymnisButtonPressed;
        x3isButtonPressed = updateButtonStates(binding.xy3);
        xx3isButtonPressed = updateButtonStates(binding.xxy3);
        if (ymnisButtonPressed) {
            binding.ymn.setBackgroundColor(pitchh);
            binding.xy3.setOnClickListener((v -> {
                toggleButtonState(binding.xy3, x3isButtonPressed);
                xx3isButtonPressed = updateButtonStates(binding.xxy3);
                umnS = 1;
            }));
            binding.xxy3.setOnClickListener((v -> {
                toggleButtonState(binding.xxy3, xx3isButtonPressed);
                x3isButtonPressed = updateButtonStates(binding.xy3);
                umnS =  2;
            }));

        } else {
            binding.ymn.setBackgroundColor(pitch);
            binding.xy3.setOnClickListener(v -> {
            });
            binding.xxy3.setOnClickListener(v -> {
            });
            umnS = 0;
        }
    }

    void delenie() {
        delhisButtonPressed = !delhisButtonPressed;
        x4isButtonPressed = updateButtonStates(binding.xy4);
        xx4isButtonPressed = updateButtonStates(binding.xxy4);
        if (delhisButtonPressed) {
            binding.del.setBackgroundColor(pitchh);
            binding.xy4.setOnClickListener((v -> {
                toggleButtonState(binding.xy4, x4isButtonPressed);
                xx4isButtonPressed = updateButtonStates(binding.xxy4);
                delS =  1;
            }));
            binding.xxy4.setOnClickListener((v -> {
                toggleButtonState(binding.xxy4, xx4isButtonPressed);
                x4isButtonPressed = updateButtonStates(binding.xy4);
                delS =  2;
            }));


        } else {
            binding.del.setBackgroundColor(pitch);
            binding.xy4.setOnClickListener(v -> {
            });
            binding.xxy4.setOnClickListener(v -> {
            });
            delS = 0;
        }
    }

    void language(boolean lang) {
        if (lang) {
            binding.slog.setText(getString(R.string.slozh_en));
            binding.vich.setText(getString(R.string.vic_en));
            binding.del.setText(getString(R.string.del_en));
            binding.ymn.setText(getString(R.string.umn_en));
            binding.zadacha.setText(getString(R.string.zad_en));
            binding.zadacha.setTextColor(whiteplus);
            binding.slozn.setText(getString(R.string.sloznost_en));
            binding.slozn.setTextColor(whiteplus);
            binding.rez.setText(getString(R.string.rez_en));
            binding.rez.setTextColor(whiteplus);
            binding.start.setText(getString(R.string.strt_en));
            binding.onemin.setText(getString(R.string.omin_en));
            binding.threemin.setText(getString(R.string.tmin_en));
            binding.fivemin.setText(getString(R.string.pmin_en));
            binding.svob.setText(getString(R.string.svob_en));
            binding.dvadprim.setText(getString(R.string.dvaprim_en));
            binding.piatprim.setText(getString(R.string.pisprim_en));
            binding.stoprim.setText(getString(R.string.stoprim_en));
        } else {
            binding.slog.setText(getString(R.string.slozh));
            binding.vich.setText(getString(R.string.vic));
            binding.del.setText(getString(R.string.del));
            binding.ymn.setText(getString(R.string.umn));
            binding.zadacha.setText(getString(R.string.zad));
            binding.zadacha.setTextColor(whiteplus);
            binding.slozn.setText(getString(R.string.sloznost));
            binding.slozn.setTextColor(whiteplus);
            binding.rez.setText(getString(R.string.rez));
            binding.rez.setTextColor(whiteplus);
            binding.start.setText(getString(R.string.strt));
            binding.onemin.setText(getString(R.string.omin));
            binding.threemin.setText(getString(R.string.tmin));
            binding.fivemin.setText(getString(R.string.pmin));
            binding.svob.setText(getString(R.string.svob));
            binding.dvadprim.setText(getString(R.string.dvaprim));
            binding.piatprim.setText(getString(R.string.pisprim));
            binding.stoprim.setText(getString(R.string.stoprim));
        }
    }
}