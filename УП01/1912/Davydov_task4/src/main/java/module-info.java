module ru.davydov.davydov_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.davydov.davydov_task4 to javafx.fxml;
    exports ru.davydov.davydov_task4;
}