package ru.davydov.davydov_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VozController {

    @FXML
    private Button GoBtn;

    @FXML
    private Label ResultLabel;

    @FXML
    private TextField vozTextFIeld;

    @FXML
    void GoBtnOnAction(ActionEvent event) {
        int n = Integer.parseInt(vozTextFIeld.getText().toString());
        if (n <= 0) {
            ResultLabel.setText("число должно быть больше 0");
            return;
        }
        boolean p = false;
       while (n > 0) {
            int s = n % 10;
            if (s == 5) {
                p = true;
                break;
            }
            n = n / 10;
        }


        ResultLabel.setText(String.valueOf(p));
    }

}
