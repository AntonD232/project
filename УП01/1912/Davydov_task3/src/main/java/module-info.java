module ru.davydov.davydov_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.davydov.davydov_task3 to javafx.fxml;
    exports ru.davydov.davydov_task3;
}