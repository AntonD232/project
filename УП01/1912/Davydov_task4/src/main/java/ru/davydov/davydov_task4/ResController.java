package ru.davydov.davydov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResController {

    @FXML
    private Button Btn;

    @FXML
    private TextField chisloTextField;

    @FXML
    private Label result;

    @FXML
    void BtnOnAction(ActionEvent event) {
        double x=Double.parseDouble(chisloTextField.getText().toString());
        double y;
        if(x>=1){
            y=x*(Math.pow(x,4)+3*x)+Math.log(Math.PI+x);
        }
        else if(x<0)
            y=Math.pow(x,5)-10-Math.pow(Math.PI + x , 1.0/4.0);
        else y=Math.pow(Math.pow(x,3)+3,3)-Math.sqrt(0.5*Math.PI+x);
result.setText("Y="+String.format("%.3f",y));
    }

}
