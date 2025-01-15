package ru.davydov.davydov_task3;

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
    private TextField znTextFIeld;

    @FXML
    void GoBtnOnAction(ActionEvent event) {
        int a=Integer.parseInt(vozTextFIeld.getText().toString());
        double b=Double.parseDouble(znTextFIeld.getText().toString());
        double r,d,l,s;

        double Pi=3.14;
        switch(a) {
            case 1:
                r = b;
                d = 2 * r;
                l = 2 * Pi * r;
                s = Pi * r * r;
                break;
            case 2:
                d = b;
                r = d / 2;
                l = 2 * Pi * r;
                s= Pi * r * r;
                break;
            case 3:
                l = b;
                r = l / (2 * Pi);
                d = 2 * r;
                s = Pi * r * r;
                break;
            case 4:
                s = b;
                r = Math.sqrt(s / Pi);
                d = 2 * r;
                l = 2 * Pi * r;
               break;
            default:
                System.err.println("Номер элемента должен быть в диапазоне 1-4.");
                return;
        }
ResultLabel.setText("Радиус="+String.format("%.3f",r)+"диаметр="+String.format("%.3f",d)+"длина="+String.format("%.3f",l)+"площадь="+String.format("%.3f",s));


    }

}
