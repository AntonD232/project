package ru.davydov.davydov_task1.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javafx.util.Duration;
import ru.davydov.davydov_task1.util.Manager;
import javafx.fxml.Initializable;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import static ru.davydov.davydov_task1.util.Manager.*;

public class fourController {

    @FXML
    private ImageView Photo;

    @FXML
    private DatePicker datpic;

    @FXML
    private Label dolabel;

    @FXML
    private Label trylabel;

    @FXML
    private TextField emailfield;

    @FXML
    private TextField famfield;

    @FXML
    private TextField imfield;


    @FXML
    private Button nazadBtn;

    @FXML
    private Button otmBtn;

    @FXML
    private PasswordField pasfield;

    @FXML
    private TextField photofield;

    @FXML
    private ComboBox<String> polCombo;

    @FXML
    private PasswordField povpasfield;

    @FXML
    private Button prosBtn;

    @FXML
    private Button regBtn;

    @FXML
    private ComboBox<?> strCombo;


    @FXML
    void nazadBtnOnAction(ActionEvent event) {
        Stage stage = (Stage) nazadBtn.getScene().getWindow();
        goBack(stage);
    }

    @FXML
    void otmBtnOnAction(ActionEvent event) {
        pasfield.clear();
        emailfield.clear();
        povpasfield.clear();

    }

    @FXML
    void prosBtnOnAction(ActionEvent event) {

    }

    @FXML
    void regBtnOnAction(ActionEvent event) {
        String email = emailfield.getText().toString();
        String pas = pasfield.getText().toString();
        String povpas = povpasfield.getText().toString();
        boolean s = pas.equals(povpas);
        int i = 1;
        if (email.isEmpty() || pas.isEmpty() || s == false) {
            trylabel.setText("Пожалуйста, заполните все поля правильно");
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), e -> {
                trylabel.setText("Пожалуйста заполните всю информацию, чтобы зарегистрироваться в качестве бегуна");
            }));
            timeline.setCycleCount(1);
            timeline.play();
        } else {
            try (BufferedReader br = new BufferedReader(new FileReader("UserLog.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(";");
                    if (parts.length > 0 && parts[0].trim().equalsIgnoreCase(email.trim())) {
                        trylabel.setText("email уже занят");
                        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), e -> {
                            trylabel.setText("Пожалуйста заполните всю информацию, чтобы зарегистрироваться в качестве бегуна");
                        }));
                        timeline.setCycleCount(1);
                        timeline.play();
                        return ;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter wr = new BufferedWriter(new FileWriter("UserLog.txt", true))) {
                wr.write(email + ";" + pas);
                wr.newLine();
                trylabel.setText("Регистрация успешна!");
                emailfield.clear();
                pasfield.clear();
                povpasfield.clear();
                showSecondStage("9sl-view.fxml");
            } catch (IOException e) {
                trylabel.setText("Ошибка при сохранении данных.");
            }
        }



    @FXML
    void strComboOnAction(ActionEvent event) {

    }
}







