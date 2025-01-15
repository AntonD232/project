package ru.davydov.davydov_task5;

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
    private Label resultLabel;

    @FXML
    void BtnOnAction(ActionEvent event) {
        int God = Integer.parseInt(aTextField.getText().toString());
        int stoletie;
            if (God % 100 == 0) {
                stoletie = God / 100;
            } else {
                stoletie = God / 100 + 1;
            }
            resultLabel.setText("Номер столетия: " + stoletie);

    }

}
