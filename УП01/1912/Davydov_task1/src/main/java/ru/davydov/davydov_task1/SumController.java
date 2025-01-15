package ru.davydov.davydov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button Btn;

    @FXML
    private TextField chisloTextField;

    @FXML
    private Label result;

    @FXML
    void BtnOnAction(ActionEvent event) {
int a=Integer.parseInt(chisloTextField.getText().toString());
if (a<=99&&a>=10){
    double b= a /10;
    double c = a % 10;
    double d = c+b;
    if(d%2==0){
        result.setText("сумма цифр двухзначного числа четная");
    }
    else result.setText("сумма цифр двухзначного числа нечетная");
}
else
    result.setText("введите двухзначное число");
    }

}
