package ru.davydov.davydov_task1.controller;


import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.awt.*;

import static java.awt.Dialog.ModalityType.APPLICATION_MODAL;

public class dpcontroller  {
    private void openModalWindow() {
    Stage modalStage=new Stage();
modalStage.initModality(Modality.APPLICATION_MODAL);
    }

}
