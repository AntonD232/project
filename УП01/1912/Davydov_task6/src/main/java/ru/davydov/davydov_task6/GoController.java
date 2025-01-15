package ru.davydov.davydov_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField chTextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(chTextField.getText().toString());
        String description;
        if (num == 0) {
            description = "нулевое число";
        }else if (num > 0) {
            if (num % 2 == 0) {
                description = "положительное четное число";
            }else {
                description = "положительное нечетное число";
            }
        }else {
            if (num % 2 == 0) {
                description = "отрицательное четное число";
            }else {
                description = "отрицательное нечетное число";
            }
        }
        result.setText(description);
    }
}
