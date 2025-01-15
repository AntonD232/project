package ru.davydov.davydov_task7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VicController {

    @FXML
    private TextField chTextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(chTextField.getText().toString());
        String description;
        if (num<=0 || num>=1000 ) {
            description = "Ошибка: число должно быть от 1 до 999";
        }else if (num<=9 ) {
                description = "однозначное";
        }else if (num<=99 ) {
                description = "двузначное";
        }else {
            description = "трехзначное";
        }
        if (num % 2 == 0 && num >0 && num <1000) {
                description += " четное число ";
        }else if(num % 2 != 0 && num >0 && num <1000)
                description += " нечетное число ";

        result.setText(description);
    }
}
