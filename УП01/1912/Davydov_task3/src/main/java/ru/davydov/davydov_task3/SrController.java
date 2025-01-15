package ru.davydov.davydov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SrController {

    @FXML
    private Button Btn;

    @FXML
    private TextField chisloTextField;

    @FXML
    private Label result;

    @FXML
    private TextField tretTextField;

    @FXML
    private TextField twoTextField;

    @FXML
    void BtnOnAction(ActionEvent event) {
        double a=Double.parseDouble(chisloTextField.getText().toString());
        double b=Double.parseDouble(twoTextField.getText().toString());
        double c=Double.parseDouble(tretTextField.getText().toString());
        double min=Math.min(Math.min(a,b),c);
        double max=Math.max(Math.max(a,b),c);
        if(a==b&& b==c)
            result.setText("числа равны");
        else result.setText("Наибольшее число:"+max +" Наименьшее число:"+min);

    }

}
