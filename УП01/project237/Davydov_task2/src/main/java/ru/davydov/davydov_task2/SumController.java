package ru.davydov.davydov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button SummaButton;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextfield;

    @FXML
    private TextField cTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void summaButtonOnAction(ActionEvent event) {
float a=Float.parseFloat(aTextField.getText().toString());
        float b=Float.parseFloat(bTextfield.getText().toString());
        float c=Float.parseFloat(cTextField.getText().toString());
        resultLabel.setText("V="+(a*b*c)+" S="+(2*(a*b+b*c+a*c)));
    }

}
