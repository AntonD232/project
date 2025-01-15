package ru.davydov.davydov_task5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.text.NumberFormat;
import java.util.List;

public class ListController {

    @FXML
    private Button OkButtonOnAction;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        double x = data.get(1);
        int n= data.get(0);
        int factor=1;
        double s = 1;
        for(int k=1; k<=n;k++){
            factor*=k;
            s += (Math.pow(x, k)*1.0) / factor;
        }
        answerLabel.setText(String.format("%.3f",s));

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty())
            return;
        if(dataListView.getItems().size() >=1000)
            dataListView.getItems().clear();
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());
            if (x>0 && x < 30001) {
                dataListView.getItems().add(0,x);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("введены некорректные данные");
                alert.showAndWait();
            }
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("введены некорректные данные");
            alert.showAndWait();
        } finally {
            numberTextField.clear();

        }
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

}
