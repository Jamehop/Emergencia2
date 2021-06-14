module DI.JavaFX {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens DI.JavaFX to javafx.fxml;
    exports DI.JavaFX;
}
