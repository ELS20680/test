module com.example.testgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.testgui to javafx.fxml;
    exports com.example.testgui;
}