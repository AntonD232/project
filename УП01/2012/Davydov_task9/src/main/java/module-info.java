module ru.davydov.davydov_task9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.davydov.davydov_task9 to javafx.fxml;
    exports ru.davydov.davydov_task9;
}