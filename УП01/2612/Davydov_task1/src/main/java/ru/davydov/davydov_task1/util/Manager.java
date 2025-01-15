package ru.davydov.davydov_task1.util;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;
import ru.davydov.davydov_task1.HelloApplication;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;


public class Manager {
    public static Stage mainStage;
    private static Stack<Scene> sceneStack = new Stack<>();


    public static void showMainStage(Stage stage, String fxmlFileName) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene((scene));
            stage.setTitle("MARATHON SKILLS 2016");
            stage.setMinWidth(300);
            stage.setMinHeight(200);
            stage.setResizable(false);
            mainStage = stage;
            sceneStack.push(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showSecondStage(String fxmlFileName) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            mainStage.setResizable(false);
            mainStage.setScene((scene));
            mainStage.setTitle("MARATHON SKILLS 2016");
            sceneStack.push(scene);
            mainStage.setScene(scene);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void goBack(Stage stage) {
        if (sceneStack.size() > 1) {
            sceneStack.pop();
            Scene previousScene = sceneStack.peek();
            stage.setScene(previousScene);
        }
    }

    public static void showSsecondStage(String fxmlFileName) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            Stage modalStage=new Stage();
            modalStage.initModality(Modality.APPLICATION_MODAL);
            modalStage.setResizable(false);
            modalStage.setTitle("MARATHON SKILLS 2016");
            modalStage.setScene(scene);
            modalStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}