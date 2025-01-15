package ru.davydov.davydov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static ru.davydov.davydov_task1.util.Manager.showMainStage;
import static ru.davydov.davydov_task1.util.Manager.showSecondStage;

public class glController {


    @FXML
    private Label denlabel;

    @FXML
    private Label dolabel;

    @FXML
    private Label gorodlabel;

    @FXML
    private Button loginBtn;

    @FXML
    private Button yaBtn;

    @FXML
    private Button yaThreeBtn;

    @FXML
    private Button yaTwoBtn;



    @FXML
    void loginBtnOnAction(ActionEvent event) {
        showSecondStage("3sl-view.fxml");
    }



    @FXML
    void yaBtnOnaction(ActionEvent event) {
        showSecondStage("2sl-view.fxml");
    }

    @FXML
    void yaThreeBtn(ActionEvent event) {

    }

    @FXML
    void yaTwoBtnonAction(ActionEvent event) {

    }

}
