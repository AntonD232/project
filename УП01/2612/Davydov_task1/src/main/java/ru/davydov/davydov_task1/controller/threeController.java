package ru.davydov.davydov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import ru.davydov.davydov_task1.util.Manager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static ru.davydov.davydov_task1.util.Manager.showSecondStage;

public class threeController {

    @FXML
    private Button CancelBtn;

    @FXML
    private Label dolabel;

    @FXML
    private TextField emailField;

    @FXML
    private Button nazadBtn;

    @FXML
    private PasswordField pasField;

    @FXML
    void CancelBtnOnaction(ActionEvent event) {
pasField.clear();
emailField.clear();

    }

    @FXML
    void loginBtnOnAction(ActionEvent event) {

        String email = emailField.getText().toString();
        String pas = pasField.getText().toString();


        try (BufferedReader reader = new BufferedReader(new FileReader("UserLog.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String existingUsername = parts[0];
                String existingPassword = parts[1];
                if (existingUsername.equals(email) && existingPassword.equals(pas)) {
                    showSecondStage("9sl-view.fxml");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при проверке имени пользователя: " + e.getMessage());
        }
    }
    @FXML
    void nazadBtnOnAction(ActionEvent event) {
        Stage stage = (Stage) nazadBtn.getScene().getWindow();
        Manager.goBack(stage);
    }
}





