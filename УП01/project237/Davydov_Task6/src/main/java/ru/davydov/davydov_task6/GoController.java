package ru.davydov.davydov_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField A1TextField;

    @FXML
    private TextField A2TextField;

    @FXML
    private TextField B1TextField;

    @FXML
    private TextField B2TextField;

    @FXML
    private TextField C1TextField;

    @FXML
    private TextField C2TextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        double A1 = Double.parseDouble(A1TextField.getText().toString());
        double B1 = Double.parseDouble(B1TextField.getText().toString());
        double C1 = Double.parseDouble(C1TextField.getText().toString());
        double A2 = Double.parseDouble(A2TextField.getText().toString());
        double B2 = Double.parseDouble(B2TextField.getText().toString());
        double C2 = Double.parseDouble(C2TextField.getText().toString());
        double D = A1 * B2 - A2 * B1;
        if (D != 0) {
            double x = (C1 * B2 - C2 * B1) / D;
            double y = (A1 * C2 - A2 * C1) / D;
            result.setText("Решение: x = " + x + ", y = " + y);
        } else {
            result.setText("Система не имеет единственного решения.");
        }

    }

}
