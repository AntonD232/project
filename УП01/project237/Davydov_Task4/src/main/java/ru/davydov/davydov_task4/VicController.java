package ru.davydov.davydov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.geom.QuadCurve2D;

public class VicController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Label choko;

    @FXML
    private Label chokoIris;

    @FXML
    private Label iris;

    @FXML
    private Button vicBtn;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextfield;

    @FXML
    void vicBtnOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText().toString());
        double y = Double.parseDouble(yTextfield.getText().toString());
        double a = Double.parseDouble(aTextField.getText().toString());
        double b = Double.parseDouble(bTextField.getText().toString());
        double vicchoko = a / x;
        double viciris = b / y;
        double vicchokoIris = vicchoko / viciris;
        String valuechoko = String.format("%.3f", vicchoko);
        String valueiris = String.format("%.3f", viciris);
        String valueChokoIris = String.format("%.3f", vicchokoIris);
        choko.setText("1кг шоколадных конфет=" + valuechoko + "рублей");
        iris.setText("1кг ирисок=" + valueiris + "рублей");
        chokoIris.setText("шоколадные конфеты дороже в" + valueChokoIris + "раз");

    }

}
