package ru.davydov.davydov_task1;

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
    private Label resultLabel;

    @FXML
    void summaButtonOnAction(ActionEvent event) {
float a=Float.parseFloat(aTextField.getText().toString());
        float b=Float.parseFloat(bTextfield.getText().toString());
        resultLabel.setText("S="+(a+b));
    }

}

