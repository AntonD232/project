package ru.davydov.davydov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VicController {

    @FXML
    private Button Btn;

    @FXML
    private Label secLabel;

    @FXML
    private TextField secTextField;

    @FXML
    void BtnOnAction(ActionEvent event) {
int a=Integer.parseInt(secTextField.getText().toString());
if(a>=0 ) {
    int b = a % 60;
    secLabel.setText("прошло секунд с последней минуты: " + b);
}
else  secLabel.setText("время не может идти в минус( ");
    }

}
