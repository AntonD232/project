package ru.davydov.davydov_task1;

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
String s;
switch (a) {
    case 1:
        b=b/10;
        s=String.valueOf(b);
        break;
    case 2:
        b=b*1000;
        s=String.valueOf(b);
        break;
    case 3:
        s=String.valueOf(b);
        break;
    case 4:
        b=b/1000;
        s=String.valueOf(b);
        break;
    case 5:
        b=b/100;
        s= String.valueOf(b);
        break;
    default:
        s="ошибка дон";
        break;
}

ResultLabel.setText("длина отрезка в метрах:"+s);
    }

}
