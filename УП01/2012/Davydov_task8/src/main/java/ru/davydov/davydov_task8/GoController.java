package ru.davydov.davydov_task8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField chTextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(chTextField.getText().toString());
        if (N < 100 || N > 999) {
            result.setText("Ошибка. Число должно быть в диапазоне 100–999.");
            return;
        }
        int hundreds = N / 100;
        int tens = (N / 10) % 10;
        int units = N % 10;
        String text = "";
        switch (hundreds) {
            case 1:
                text += "сто ";
                break;
            case 2:
                text += "двести ";
                break;
            case 3:
                text += "триста ";
                break;
            case 4:
                text += "четыреста ";
                break;
            case 5:
                text += "пятьсот ";
                break;
            case 6:
                text += "шестьсот ";
                break;
            case 7:
                text += "семьсот ";
                break;
            case 8:
                text += "восемьсот ";
                break;
            case 9:
                text += "девятьсот ";
                break;
        }
        if (tens == 1) { 
            switch (units) {
                case 0:
                    text += "десять";
                    break;
                case 1:
                    text += "одиннадцать";
                    break;
                case 2:
                    text += "двенадцать";
                    break;
                case 3:
                    text += "тринадцать";
                    break;
                case 4:
                    text += "четырнадцать";
                    break;
                case 5:
                    text += "пятнадцать";
                    break;
                case 6:
                    text += "шестнадцать";
                    break;
                case 7:
                    text += "семнадцать";
                    break;
                case 8:
                    text += "восемнадцать";
                    break;
                case 9:
                    text += "девятнадцать";
                    break;
            }
        } else {
            switch (tens) {
                case 2:
                    text += "двадцать ";
                    break;
                case 3:
                    text += "тридцать ";
                    break;
                case 4:
                    text += "сорок ";
                    break;
                case 5:
                    text += "пятьдесят ";
                    break;
                case 6:
                    text += "шестьдесят ";
                    break;
                case 7:
                    text += "семьдесят ";
                    break;
                case 8:
                    text += "восемьдесят ";
                    break;
                case 9:
                    text += "девяносто ";
                    break;
            }
            switch (units) {
                case 1:
                    text += "один";
                    break;
                case 2:
                    text += "два";
                    break;
                case 3:
                    text += "три";
                    break;
                case 4:
                    text += "четыре";
                    break;
                case 5:
                    text += "пять";
                    break;
                case 6:
                    text += "шесть";
                    break;
                case 7:
                    text += "семь";
                    break;
                case 8:
                    text += "восемь";
                    break;
                case 9:
                    text += "девять";
                    break;
            }
        }
        result.setText(text.trim());

    }

}
