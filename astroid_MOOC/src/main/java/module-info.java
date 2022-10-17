module com.example.astroid_mooc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.astroid_mooc to javafx.fxml;
    exports com.example.astroid_mooc;
}