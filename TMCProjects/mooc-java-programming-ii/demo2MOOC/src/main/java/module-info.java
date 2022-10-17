module com.example.demo2mooc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo2mooc to javafx.fxml;
    exports com.example.demo2mooc;
}