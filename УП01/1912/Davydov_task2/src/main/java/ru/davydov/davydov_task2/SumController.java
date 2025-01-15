package ru.davydov.davydov_task2;

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
    private TextField twoTextField;

    @FXML
    void BtnOnAction(ActionEvent event) {
double a=Double.parseDouble(chisloTextField.getText().toString());
double b=Double.parseDouble(twoTextField.getText().toString());
if(a>b)
    result.setText("большее число"+String.format("%.3f",a));
else result.setText("большее число"+String.format("%.3f",b));
    }

}
