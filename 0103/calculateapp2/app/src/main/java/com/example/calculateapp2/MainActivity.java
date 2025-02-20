package com.example.calculateapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.calculateapp2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    int slogS, vichS, umnS, delS;
    int rezhim=-1;
    boolean x1isButtonPressed, xx1isButtonPressed, xxyyisButtonPressed, x3isButtonPressed, xx3isButtonPressed;
    boolean x2isButtonPressed, xx2isButtonPressed, xxyy2isButtonPressed, x4isButtonPressed, xx4isButtonPressed;
    boolean slogisButtonPressed, vichisButtonPressed, ymnisButtonPressed, delhisButtonPressed;
    boolean onem,twom,fivem,svobm,dvap,fivep,stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.en.setOnClickListener((v -> En_lang()));
        binding.ru.setOnClickListener((v -> Ru_lang()));
        binding.slog.setOnClickListener((v -> plus()));
        binding.vich.setOnClickListener((v -> minus()));
        binding.ymn.setOnClickListener((v -> umnozenie()));
        binding.del.setOnClickListener((v -> delenie()));
        binding.start.setOnClickListener((v -> startNewActivity()));
        rezhim();

    }

    void rezhim(){
        onem=updateButtonStates(binding.onemin);
        twom=updateButtonStates(binding.threemin);
        fivem=updateButtonStates(binding.fivemin);
        svobm=updateButtonStates(binding.svob);
        dvap=updateButtonStates(binding.dvadprim);
        fivep=updateButtonStates(binding.piatprim);
        stop=updateButtonStates(binding.stoprim);
        binding.onemin.setOnClickListener(v ->{
            toggleButtonState(binding.onemin, onem);
            twom=updateButtonStates(binding.threemin);
            fivem=updateButtonStates(binding.fivemin);
            svobm=updateButtonStates(binding.svob);
            dvap=updateButtonStates(binding.dvadprim);
            fivep=updateButtonStates(binding.piatprim);
            stop=updateButtonStates(binding.stoprim);
            rezhim = proverka(onem, 1);
            } );
        binding.threemin.setOnClickListener(v ->{
            toggleButtonState(binding.threemin, twom);
            onem=updateButtonStates(binding.onemin);
            fivem=updateButtonStates(binding.fivemin);
            svobm=updateButtonStates(binding.svob);
            dvap=updateButtonStates(binding.dvadprim);
            fivep=updateButtonStates(binding.piatprim);
            stop=updateButtonStates(binding.stoprim);
            rezhim = proverka(twom, 2);
            } );
        binding.fivemin.setOnClickListener(v ->{
            toggleButtonState(binding.fivemin,fivem);
            onem=updateButtonStates(binding.onemin);
            twom=updateButtonStates(binding.threemin);
            svobm=updateButtonStates(binding.svob);
            dvap=updateButtonStates(binding.dvadprim);
            fivep=updateButtonStates(binding.piatprim);
            stop=updateButtonStates(binding.stoprim);
            rezhim = proverka(fivem, 3);
            } );
        binding.svob.setOnClickListener(v -> {
            toggleButtonState(binding.svob,svobm);
            onem=updateButtonStates(binding.onemin);
            twom=updateButtonStates(binding.threemin);
            fivem=updateButtonStates(binding.fivemin);
            dvap=updateButtonStates(binding.dvadprim);
            fivep=updateButtonStates(binding.piatprim);
            stop=updateButtonStates(binding.stoprim);
            rezhim = proverka(svobm, 0);
            });
        binding.dvadprim.setOnClickListener(v -> {
            toggleButtonState(binding.dvadprim,dvap);
            onem=updateButtonStates(binding.onemin);
            twom=updateButtonStates(binding.threemin);
            fivem=updateButtonStates(binding.fivemin);
            svobm=updateButtonStates(binding.svob);
            fivep=updateButtonStates(binding.piatprim);
            stop=updateButtonStates(binding.stoprim);
            rezhim = proverka(dvap, 4);
            });
        binding.piatprim.setOnClickListener(v ->{
            toggleButtonState(binding.piatprim,fivep);
            onem=updateButtonStates(binding.onemin);
            twom=updateButtonStates(binding.threemin);
            fivem=updateButtonStates(binding.fivemin);
            svobm=updateButtonStates(binding.svob);
            dvap=updateButtonStates(binding.dvadprim);
            stop=updateButtonStates(binding.stoprim);
            rezhim = proverka(fivep, 5);
            } );
        binding.stoprim.setOnClickListener(v -> {
            toggleButtonState(binding.stoprim,stop);
            onem=updateButtonStates(binding.onemin);
            twom=updateButtonStates(binding.threemin);
            fivem=updateButtonStates(binding.fivemin);
            svobm=updateButtonStates(binding.svob);
            dvap=updateButtonStates(binding.dvadprim);
            fivep=updateButtonStates(binding.piatprim);
            rezhim = proverka(stop, 6);});
    }

    private boolean updateButtonStates(Button button) {
        button.setBackgroundColor(getColor(R.color.pitch));
        return false;
    }

    private void toggleButtonState(Button button, boolean isPressed) {
        isPressed=!isPressed;
        if (isPressed) {
            button.setBackgroundColor(getColor(R.color.pitchh));
        } else {
            button.setBackgroundColor(getColor(R.color.pitch));
        }
    }

    int proverka(boolean isPressed, int znachenie) {
        isPressed=false;
        isPressed=!isPressed;
        int sss;
        if (isPressed ) {
            sss = znachenie;
        } else {
            sss = -1;
        }
        return sss;
    }

    void plus() {
        slogisButtonPressed = !slogisButtonPressed;
        x1isButtonPressed = updateButtonStates(binding.xy1);
        xx1isButtonPressed = updateButtonStates(binding.xxy1);
        xxyyisButtonPressed = updateButtonStates(binding.xxyy1);
        if (slogisButtonPressed) {
            binding.slog.setBackgroundColor(getColor(R.color.pitchh));
            binding.xy1.setOnClickListener((v -> {
                toggleButtonState(binding.xy1, x1isButtonPressed);
                xx1isButtonPressed = updateButtonStates(binding.xxy1);
                xxyyisButtonPressed = updateButtonStates(binding.xxyy1);
                slogS = proverka(x1isButtonPressed, 1);
            }));
            binding.xxy1.setOnClickListener((v -> {
                toggleButtonState(binding.xxy1, xx1isButtonPressed);
                x1isButtonPressed = updateButtonStates(binding.xy1);
                xxyyisButtonPressed = updateButtonStates(binding.xxyy1);
                slogS = proverka(xx1isButtonPressed, 2);
            }));
            binding.xxyy1.setOnClickListener((v -> {
                toggleButtonState(binding.xxyy1, xxyyisButtonPressed);
                x1isButtonPressed = updateButtonStates(binding.xy1);
                xx1isButtonPressed = updateButtonStates(binding.xxy1);
                slogS = proverka(xxyyisButtonPressed, 3);
            }));

        } else {
            binding.slog.setBackgroundColor(getColor(R.color.pitch));
            binding.xy1.setOnClickListener(v -> {
            });
            binding.xxy1.setOnClickListener(v -> {
            });
            binding.xxyy1.setOnClickListener(v -> {
            });
            slogS = -1;
        }
    }

    void minus() {
        vichisButtonPressed = !vichisButtonPressed;
        x2isButtonPressed = updateButtonStates(binding.xy2);
        xx2isButtonPressed = updateButtonStates(binding.xxy2);
        xxyy2isButtonPressed = updateButtonStates(binding.xxyy2);
        if (vichisButtonPressed) {
            binding.vich.setBackgroundColor(getColor(R.color.pitchh));
            binding.xy2.setOnClickListener((v -> {
                toggleButtonState(binding.xy2, x2isButtonPressed);
                xx2isButtonPressed = updateButtonStates(binding.xxy2);
                xxyy2isButtonPressed = updateButtonStates(binding.xxyy2);
                vichS = proverka(x2isButtonPressed, 1);
            }));
            binding.xxy2.setOnClickListener((v -> {
                toggleButtonState(binding.xxy2, xx2isButtonPressed);
                x2isButtonPressed = updateButtonStates(binding.xy2);
                xxyy2isButtonPressed = updateButtonStates(binding.xxyy2);
                vichS = proverka(xx2isButtonPressed, 2);
            }));
            binding.xxyy2.setOnClickListener((v -> {
                toggleButtonState(binding.xxyy2, xxyy2isButtonPressed);
                x2isButtonPressed = updateButtonStates(binding.xy2);
                xx2isButtonPressed = updateButtonStates(binding.xxy2);
                vichS = proverka(xxyyisButtonPressed, 3);
            }));

        } else {
            binding.vich.setBackgroundColor(getColor(R.color.pitch));
            binding.xy2.setOnClickListener(v -> {
            });
            binding.xxy2.setOnClickListener(v -> {
            });
            binding.xxyy2.setOnClickListener(v -> {
            });
            vichS = -1;
        }

    }

    void umnozenie() {
        ymnisButtonPressed = !ymnisButtonPressed;
        x3isButtonPressed = updateButtonStates(binding.xy3);
        xx3isButtonPressed = updateButtonStates(binding.xxy3);
        if (ymnisButtonPressed) {
            binding.ymn.setBackgroundColor(getColor(R.color.pitchh));
            binding.xy3.setOnClickListener((v -> {
                toggleButtonState(binding.xy3, x3isButtonPressed);
                xx3isButtonPressed = updateButtonStates(binding.xxy3);
                umnS = proverka(x3isButtonPressed, 1);
            }));
            binding.xxy3.setOnClickListener((v -> {
                toggleButtonState(binding.xxy3, xx3isButtonPressed);
                x3isButtonPressed = updateButtonStates(binding.xy3);
                umnS = proverka(xx3isButtonPressed, 2);
            }));

        } else {
            binding.ymn.setBackgroundColor(getColor(R.color.pitch));
            binding.xy3.setOnClickListener(v -> {
            });
            binding.xxy3.setOnClickListener(v -> {
            });
            umnS = -1;
        }
    }

    void delenie() {
        delhisButtonPressed = !delhisButtonPressed;
        x4isButtonPressed = updateButtonStates(binding.xy4);
        xx4isButtonPressed = updateButtonStates(binding.xxy4);
        if (delhisButtonPressed) {
            binding.del.setBackgroundColor(getColor(R.color.pitchh));
            binding.xy4.setOnClickListener((v -> {
                toggleButtonState(binding.xy4, x4isButtonPressed);
                xx4isButtonPressed = updateButtonStates(binding.xxy4);
                delS = proverka(x4isButtonPressed, 1);
            }));
            binding.xxy4.setOnClickListener((v -> {
                toggleButtonState(binding.xxy4, xx4isButtonPressed);
                x4isButtonPressed = updateButtonStates(binding.xy4);
                delS = proverka(xx4isButtonPressed, 2);
            }));


        } else {
            binding.del.setBackgroundColor(getColor(R.color.pitch));
            binding.xy4.setOnClickListener(v -> {
            });
            binding.xxy4.setOnClickListener(v -> {
            });
            delS = -1;
        }
    }

    void En_lang() {
        binding.slog.setText(getString(R.string.slozh_en));
        binding.vich.setText(getString(R.string.vic_en));
        binding.del.setText(getString(R.string.del_en));
        binding.ymn.setText(getString(R.string.umn_en));
        binding.zadacha.setText(getString(R.string.zad_en));
        binding.zadacha.setTextColor(getColor(R.color.whiteplus));
        binding.slozn.setText(getString(R.string.sloznost_en));
        binding.slozn.setTextColor(getColor(R.color.whiteplus));
        binding.rez.setText(getString(R.string.rez_en));
        binding.rez.setTextColor(getColor(R.color.blue));
        binding.start.setText(getString(R.string.strt_en));
        binding.onemin.setText(getString(R.string.omin_en));
        binding.threemin.setText(getString(R.string.tmin_en));
        binding.fivemin.setText(getString(R.string.pmin_en));
        binding.svob.setText(getString(R.string.svob_en));
        binding.dvadprim.setText(getString(R.string.dvaprim_en));
        binding.piatprim.setText(getString(R.string.pisprim_en));
        binding.stoprim.setText(getString(R.string.stoprim_en));
    }

    void Ru_lang() {
        binding.slog.setText(getString(R.string.slozh));
        binding.vich.setText(getString(R.string.vic));
        binding.del.setText(getString(R.string.del));
        binding.ymn.setText(getString(R.string.umn));
        binding.zadacha.setText(getString(R.string.zad));
        binding.zadacha.setTextColor(getColor(R.color.whiteplus));
        binding.slozn.setText(getString(R.string.sloznost));
        binding.slozn.setTextColor(getColor(R.color.whiteplus));
        binding.rez.setText(getString(R.string.rez));
        binding.rez.setTextColor(getColor(R.color.blue));
        binding.start.setText(getString(R.string.strt));
        binding.onemin.setText(getString(R.string.omin));
        binding.threemin.setText(getString(R.string.tmin));
        binding.fivemin.setText(getString(R.string.pmin));
        binding.svob.setText(getString(R.string.svob));
        binding.dvadprim.setText(getString(R.string.dvaprim));
        binding.piatprim.setText(getString(R.string.pisprim));
        binding.stoprim.setText(getString(R.string.stoprim));
    }

    public void startNewActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("1", slogS);
        intent.putExtra("2", vichS);
        intent.putExtra("4", delS);
        intent.putExtra("3", umnS);
        intent.putExtra("5", rezhim);
        if ((slogS != -1 || vichS != -1 || delS != -1 || umnS != -1) && rezhim!=-1)
            startActivity(intent);

    }
}