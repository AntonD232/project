package ru.davydov.davydov_task7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VozController {

    @FXML
    private Button GoBtn;

    @FXML
    private Label ResultLabel;

    @FXML
    private TextField vozTextFIeld;

    @FXML
    void GoBtnOnAction(ActionEvent event) {
        int a=Integer.parseInt(vozTextFIeld.getText().toString());
        int b=a/10;
        int c= a %10;
        String des;
        if((a>=10 && a<20) || a==40)
        switch(a) {
            case 10:
                des = "десять учебных заданий";
                break;
            case 11:
                des = "одиннадцать учебных заданий";
                break;
            case 12:
                des = "двенадцать учебных заданий";
                break;
            case 13:
                des = "тринадцать учебных заданий";
                break;
            case 14:
                des = "четырнадцать учебных заданий";
                break;
            case 15:
                des = "пятнадцать учебных заданий";
                break;
            case 16:
                des = "шестнадцать учебных заданий";
                break;
            case 17:
                des = "семнадцать учебных заданий";
                break;
            case 18:
                des = "восемнадцать учебных заданий";
                break;
            case 19:
                des = "девятнадцать учебных заданий";
                break;
            case 40:
                des = "сорок учебных заданий";
                break;
            default:
                des="";
                break;
        }
        else {
            switch (b) {
                case 2:
                    des = "двадцать";
                    break;
                case 3:
                    des = "тридцать";
                    break;
                default:
                    des = "ошибка";
                    break;
            }
            if (b >= 2 && b < 4)
                switch (c) {
                    case 0:
                        des += " учебных заданий";
                        break;
                    case 1:
                        des += " одно учебное заданий";
                        break;
                    case 2:
                        des += " два учебных заданий";
                        break;
                    case 3:
                        des += " три учебных заданий";
                        break;
                    case 4:
                        des += " четыре учебных заданий";
                        break;
                    case 5:
                        des += " пять учебных заданий";
                        break;
                    case 6:
                        des += " шесть учебных заданий";
                        break;
                    case 7:
                        des += " семь учебных заданий";
                        break;
                    case 8:
                        des += " восемь учебных заданий";
                        break;
                    case 9:
                        des += " девять учебных заданий";
                        break;
                    default:
                        break;

                }
        }
        ResultLabel.setText(des);
    }

}
