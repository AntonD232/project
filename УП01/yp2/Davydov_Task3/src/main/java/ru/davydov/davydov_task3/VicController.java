package ru.davydov.davydov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VicController {

    @FXML
    private Button Btn;

    @FXML
    private Label denLabel;

    @FXML
    private TextField denTextField;

    @FXML
    void BtnOnAction(ActionEvent event) {
int a=Integer.parseInt(denTextField.getText().toString());
int b= a % 7;
if(1<=a&&a<=365)
switch (b) {
    case 0:
        denLabel.setText("день недели: воскресенье");
break;
    case 1:
        denLabel.setText("день недели: понедельник");
        break;
    case 2:
        denLabel.setText("день недели: вторник");
        break;
    case 3:
        denLabel.setText("день недели: среда");
        break;
    case 4:
        denLabel.setText("день недели: четверг");
        break;
    case 5:
        denLabel.setText("день недели: пятница");
        break;
    case 6:
        denLabel.setText("день недели: суббота");
break;

}
else
    denLabel.setText("введите число попадающее под текущий год");
    }

}
