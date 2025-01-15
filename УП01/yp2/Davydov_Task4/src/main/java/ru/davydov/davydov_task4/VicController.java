package ru.davydov.davydov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VicController {

    @FXML
    private Button Btn;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField acextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void BtnOnAction(ActionEvent event) {
        int A = Integer.parseInt(aTextField.getText().toString());
        int B = Integer.parseInt(bTextField.getText().toString());
        int C = Integer.parseInt(acextField.getText().toString());
        int KolichKvPoDline = A / C;
        int KolichKvPoShirine = B / C;
        int VsegoKv = KolichKvPoDline * KolichKvPoShirine;
        int PlosPryam = A * B;
        int PlosKv = VsegoKv * (C * C);
        int FreePlos = PlosPryam - PlosKv;
        resultLabel.setText("Количество квадратов: " + VsegoKv + "Площадь незанятой части: " + FreePlos);

    }

}
