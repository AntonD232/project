package ru.davydov.davydov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import ru.davydov.davydov_task1.util.Manager;

import static ru.davydov.davydov_task1.util.Manager.showSecondStage;


public class twoslController {

    @FXML
    private Label dolabel;

    @FXML
    private Button loginBtn;

    @FXML
    private Button logoutbtn;

    @FXML
    private Button nazadBtn;

    @FXML
    private Button novBtn;

    @FXML
    private Button ranBtn;


    @FXML
    void loginBtnOnAction(ActionEvent event) {
        showSecondStage("3sl-view.fxml");
    }



    @FXML
    void nazadBtnOnaction(ActionEvent event) {
        Stage stage = (Stage) nazadBtn.getScene().getWindow();
        Manager.goBack(stage);
    }

    @FXML
    void novBtnOnAction(ActionEvent event) {
        showSecondStage("4sl-view.fxml");
    }

    @FXML
    void ranBtnOnaction(ActionEvent event) {
        showSecondStage("3sl-view.fxml");
    }

}
