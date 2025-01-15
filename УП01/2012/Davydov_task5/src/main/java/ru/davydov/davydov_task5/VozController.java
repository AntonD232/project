package ru.davydov.davydov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.geom.QuadCurve2D;

public class VozController {

    @FXML
    private Button GoBtn;

    @FXML
    private Label ResultLabel;

    @FXML
    private TextField vozTextFIeld;

    @FXML
    void GoBtnOnAction(ActionEvent event) {
        double p = Double.parseDouble(vozTextFIeld.getText().toString());
        double s = 1000;
        int k = 0;
        if (p <= 0 && p >= 25) {
            ResultLabel.setText("Ошибка: P должно быть в диапазоне (0, 25).");
            return;
        }

        while (s < 1100) {
                s += s * (p / 100);
                k++;
            }
            ResultLabel.setText("Через "+k+" месяцев счет будет >1100. итоговый размер:"+String.format("%.2f",s));
        }

    }
