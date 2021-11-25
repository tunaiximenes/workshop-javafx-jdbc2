module com.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workshopjavafxjdbc2 to javafx.fxml;
    exports com.example.workshopjavafxjdbc2;
    exports com.example.workshopjavafxjdbc2.gui;
    opens com.example.workshopjavafxjdbc2.gui to javafx.fxml;
    exports com.example.workshopjavafxjdbc2.gui.util;
    opens com.example.workshopjavafxjdbc2.gui.util to javafx.fxml;
    exports application;
    opens application to javafx.fxml;
    exports gui;
    opens gui to javafx.fxml;
    exports gui.util;
    opens gui.util to javafx.fxml;
}