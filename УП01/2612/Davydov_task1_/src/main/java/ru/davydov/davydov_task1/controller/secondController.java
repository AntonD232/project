package ru.davydov.davydov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.davydov.davydov_task1.util.Manager.showMainStage;
import static ru.davydov.davydov_task1.util.Manager.showSecondStage;

public class secondController {

    @FXML
    private Button GoBtn;

    @FXML
    void GoBtnOnAction(ActionEvent event) {
        showSecondStage("hello-view.fxml", "one");
    }

}
