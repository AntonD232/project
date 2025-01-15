module ru.davydov.davydov_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.davydov.davydov_task1 to javafx.fxml;
    exports ru.davydov.davydov_task1;
}