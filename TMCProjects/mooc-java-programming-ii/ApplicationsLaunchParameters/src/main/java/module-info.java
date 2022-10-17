module com.example.applicationslaunchparameters {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mooc13 to javafx.fxml;
    exports com.example.mooc13;
    exports com.example.dictionary;
    opens com.example.dictionary to javafx.fxml;
}