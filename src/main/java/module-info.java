module com.example.workshopjavafxjdbc2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workshopjavafxjdbc2 to javafx.fxml;
    exports com.example.workshopjavafxjdbc2;
}