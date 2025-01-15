package ru.davydov.davydov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static ru.davydov.davydov_task1.util.Manager.showSecondStage;

public class eightController {

    @FXML
    private Label dolabel;


    @FXML
    private Button okbtn;


    @FXML
    void okbtnOnAction(ActionEvent event) {
        showSecondStage("9sl-view.fxml");
    }

}
