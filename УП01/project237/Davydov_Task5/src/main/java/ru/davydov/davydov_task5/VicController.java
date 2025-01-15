package ru.davydov.davydov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VicController {

    @FXML
    private TextField bTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button vicBtn;

    @FXML
    private TextField xTextField;

    @FXML
    void vicBtnOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText().toString());
        double b = Double.parseDouble(bTextField.getText().toString());
        double z = Math.pow(x, 2) * Math.pow(b, 2);
        double a = (Math.pow(x, 6) + Math.cbrt(z * Math.pow(x, 2) + Math.cos(x + z))) / Math.log(Math.abs(x + z));
        String result = String.format("%.3f", a);
        resultLabel.setText("a=" + result);
    }

}
