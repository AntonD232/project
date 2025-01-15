module ru.davydov.davydov_task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.davydov.davydov_task7 to javafx.fxml;
    exports ru.davydov.davydov_task7;
}