package ru.davydov.davydov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;
import ru.davydov.davydov_task1.util.Manager;


import static ru.davydov.davydov_task1.util.Manager.showSecondStage;
import static ru.davydov.davydov_task1.util.Manager.showSsecondStage;


public class nineController extends AnchorPane {

    @FXML
    private Label dolabel;

    @FXML
    private Button konBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private Button nazadBtn;

    @FXML
    private Button red;

    @FXML
    private Button regBtn;

    @FXML
    private Button rezBtn;


    @FXML
    void konBtnOnAction(ActionEvent event) {
        showSsecondStage("dp-view.fxml");
    }

    @FXML
    void logoutBtnOnAction(ActionEvent event) {
        showSecondStage("gl-view.fxml");
    }

    @FXML
    void nazadBtnOnAction(ActionEvent event) {

    }

    @FXML
    void redOnAction(ActionEvent event) {

    }

    @FXML
    void regBtnOnaction(ActionEvent event) {
        showSecondStage("5sl-view.fxml");
    }

    @FXML
    void rezBtnOnAction(ActionEvent event) {

    }

    @FXML
    void spBtnOnAction(ActionEvent event) {

    }

}
