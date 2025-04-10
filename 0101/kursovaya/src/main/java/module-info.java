module ru.davydov.kursovaya {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.davydov.kursovaya to javafx.fxml;
    exports ru.davydov.kursovaya;
}