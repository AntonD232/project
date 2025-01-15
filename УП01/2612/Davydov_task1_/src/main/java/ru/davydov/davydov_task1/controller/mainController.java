package ru.davydov.davydov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.davydov.davydov_task1.util.Manager.showSecondStage;

public class mainController implements Initializable {

    @FXML
    private Button GoBtn;

    @FXML
    void GoBtnOnAction(ActionEvent event) {
        showSecondStage("second-view.fxml", "two");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GoBtn.setStyle("-fx-background-color: #20B2AA; -fx-background-radius: 5px; -fx-text-fill: #ffffff");
    }
}
