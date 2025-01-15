package ru.davydov.davydov_task4;

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
        int a = Integer.parseInt(vozTextFIeld.getText().toString());
        int k = a;
        double s = 1;
        if (a <= 0) {
            ResultLabel.setText("Число должно быть больше 0.");
            return;
        }
            while (k > 0) {
                s *=k;
                k -= 2;
            }
        ResultLabel.setText(String.format("%.3f", s));
    }

}
