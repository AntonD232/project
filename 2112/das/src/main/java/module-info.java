module ru.davydov.das {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.davydov.das to javafx.fxml;
    exports ru.davydov.das;
}