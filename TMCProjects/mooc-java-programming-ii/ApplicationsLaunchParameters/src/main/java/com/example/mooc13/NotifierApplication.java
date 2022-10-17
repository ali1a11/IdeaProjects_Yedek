package com.example.mooc13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public void start(Stage window) {
        TextField upText = new TextField();

        Button button = new Button("Update");

        Label label = new Label();


        button.setOnAction((event) -> {
            label.setText(upText.getText());
        });

        VBox componentGroup = new VBox();
        componentGroup.setSpacing(10);
        componentGroup.getChildren().addAll(upText, button, label);

        Scene viewport = new Scene(componentGroup);

        window.setScene(viewport);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
}
