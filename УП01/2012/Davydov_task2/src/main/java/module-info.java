module ru.davydov.davydov_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.davydov.davydov_task2 to javafx.fxml;
    exports ru.davydov.davydov_task2;
}