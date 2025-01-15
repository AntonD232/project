module ru.davydov.davydov_task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.davydov.davydov_task1 to javafx.fxml;
    exports ru.davydov.davydov_task1;
    exports ru.davydov.davydov_task1.controller;
    opens ru.davydov.davydov_task1.controller to javafx.fxml;
}