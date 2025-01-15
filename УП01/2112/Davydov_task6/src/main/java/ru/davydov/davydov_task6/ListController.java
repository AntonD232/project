package ru.davydov.davydov_task6;

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
        int x = data.get(0);
        double v1=0;
        double v2=0;
        double v3=1.5;
        double vn=0;
        if(x==1){
            answerLabel.setText(String.valueOf(v1));
            return;
        }else if(x==2){
            answerLabel.setText(String.valueOf(v2));
            return;
        }else if(x==3) {
            answerLabel.setText(String.valueOf(v3));
            return;
        }else {
            double vm3 = v1;
            double vm2 = v2;
            double vm1 = v3;
            for (int i = 4; i <= x; i++){
                vn=((double)(i+1)/(i*i+1)*vm1-vm2-2*vm3);
                vm3=vm2;
                vm2=vm1;
                vm1=vn;
            }


                answerLabel.setText(String.format("%.3f", vn));

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
