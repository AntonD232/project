package ru.davydov.davydov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;




public class GoController {

    @FXML
    private Button goBtn;

    @FXML
    private TextField pTextfield;

    @FXML
    private TextField sTextfield;

    @FXML
    private TextField x1TextField;

    @FXML
    private TextField x2TextField;

    @FXML
    private TextField y1TextField;

    @FXML
    private TextField y2Textfield;

    @FXML
    void goBtnOnAction(ActionEvent event) {
        double x1 = Double.parseDouble(x1TextField.getText().toString());
        double x2 = Double.parseDouble(x2TextField.getText().toString());
        double y1 = Double.parseDouble(y1TextField.getText().toString());
        double y2 = Double.parseDouble(y2Textfield.getText().toString());
        double a=Math.abs(x2-x1);
        double b=Math.abs(y1-y2);
        sTextfield.setText(String.valueOf(a*b));
        pTextfield.setText(String.valueOf(2*(a+b)));
    }

}
