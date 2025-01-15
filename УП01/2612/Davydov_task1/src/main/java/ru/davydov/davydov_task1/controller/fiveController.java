package ru.davydov.davydov_task1.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;
import ru.davydov.davydov_task1.util.Manager;

import static ru.davydov.davydov_task1.util.Manager.showSecondStage;

public class fiveController {
public int total=0;
public String s="$";
    @FXML
    private RadioButton aBtn;

    @FXML
    private RadioButton bBtn;

    @FXML
    private RadioButton cBtn;

    @FXML
    private Label dengaLabel;


    @FXML
    private Label trylabel;

    @FXML
    private Label dolabel;

    @FXML
    private Button logoutBtn;

    @FXML
    private CheckBox malbox;

    @FXML
    private CheckBox marbox;

    @FXML
    private Button nazadBtn;

    @FXML
    private Button otmbtn;

    @FXML
    private CheckBox polbox;

    @FXML
    private Button regBtn;

    @FXML
    private TextField summfield;

    @FXML
    private ComboBox<?> vznCombo;

    @FXML
    void aBtnOnAction(ActionEvent event) {
        if (aBtn.isSelected()) {
            total += 0;
        } else total-=0;
        dengaLabel.setText(s+String.valueOf(total));
    }

    @FXML
    void bBtnOnAction(ActionEvent event) {
        if (bBtn.isSelected()) {
            total += 20;
        } else total-=20;
        dengaLabel.setText(s+String.valueOf(total));
    }

    @FXML
    void cBtnOnAction(ActionEvent event) {
        if (cBtn.isSelected()) {
            total += 45;
        } else total-=45;
        dengaLabel.setText(s+String.valueOf(total));

    }

    @FXML
    void logoutBtnOnAction(ActionEvent event) {
        showSecondStage("gl-view.fxml");
    }

    @FXML
    void malboxOnAction(ActionEvent event) {
        if (malbox.isSelected()) {
            total += 20;
        } else total-=20;
        dengaLabel.setText(s+String.valueOf(total));
    }

    @FXML
    void marboxOnaction(ActionEvent event) {
        if (marbox.isSelected()) {
            total += 145;
        } else total-=145;
        dengaLabel.setText(s+String.valueOf(total));
    }

    @FXML
    void nazadBtnOnAction(ActionEvent event) {
        Stage stage = (Stage) nazadBtn.getScene().getWindow();
        Manager.goBack(stage);
    }

    @FXML
    void otmbtnOnAction(ActionEvent event) {

    }

    @FXML
    void polboxOnAction(ActionEvent event) {
        if (polbox.isSelected()) {
            total += 75;
        }else total-=75;
        dengaLabel.setText(s+String.valueOf(total));
    }

    @FXML
    void regBtnOnAction(ActionEvent event) {
        if((marbox.isSelected() || malbox.isSelected()|| polbox.isSelected()) && (aBtn.isSelected()|| bBtn.isSelected()||cBtn.isSelected()) ) {
            if (total > 0) {
                showSecondStage("8sl-view.fxml");
            }
        }
        else {
            trylabel.setText("выберите хотя бы 1 вид и 1 вариант");
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), e -> {
                trylabel.setText("Пожалуйста заполните всю информацию, чтобы зарегистрироваться на SkillsMarathon 2016 проводимом в Москве. Russia. С вами свяжутся послерегистрации для уточнения оплаты и другой информации.");
            }));
            timeline.setCycleCount(1);
            timeline.play();
        }
}

    @FXML
    void vznComboOnaction(ActionEvent event) {

    }

}
