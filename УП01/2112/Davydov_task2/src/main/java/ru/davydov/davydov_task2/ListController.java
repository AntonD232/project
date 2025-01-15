package ru.davydov.davydov_task2;

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
        int n = data.get(0);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int m = data.get(i);

            if (m % 3 == 0 && m < min && m != 0) {
                min = m;
            }
            answerLabel.setText(String.valueOf(min));
        }

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty())
            return;
        if(dataListView.getItems().size() >=1000)
            dataListView.getItems().clear();
        try {

            int x = Integer.parseInt(numberTextField.getText().toString());
            if ( x < 30001) {
                dataListView.getItems().add(x);
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
