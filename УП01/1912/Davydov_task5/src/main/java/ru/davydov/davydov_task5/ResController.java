package ru.davydov.davydov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ResController {

    @FXML
    private Button Btn;

    @FXML
    private ImageView ImageVIew;

    @FXML
    private Label result;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextFIeld;

    @FXML
    void BtnOnAction(ActionEvent event) {
double x=Double.parseDouble(xTextField.getText().toString());
        double y=Double.parseDouble(yTextFIeld.getText().toString());
        if(Math.pow(x,2)+Math.pow(y,2)==Math.pow(10,2)|| y==-x){
            result.setText("на границе");
        }
        else if (Math.pow(x,2)+Math.pow(y,2)<Math.pow(10,2)&& y>-x){
            result.setText("da");
        } else
            result.setText("net");
    }

}
