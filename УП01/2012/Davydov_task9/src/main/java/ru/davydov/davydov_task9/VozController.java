package ru.davydov.davydov_task9;

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
    private TextField aTextFIeld;

    @FXML
    private TextField bTextFIeld;

    @FXML
    void GoBtnOnAction(ActionEvent event) {
      int a=Integer.parseInt(aTextFIeld.getText().toString());
      int b=Integer.parseInt(bTextFIeld.getText().toString());
        if (a <= 0 || b <= 0) {
            ResultLabel.setText("Числа должны быть положительными.");
            return;
        }

       int t;
        while (b != 0) {
            t =  b;
            b = a % b;
            a = t;
        }

ResultLabel.setText("Наибольшый делитель"+a);
    }

}
