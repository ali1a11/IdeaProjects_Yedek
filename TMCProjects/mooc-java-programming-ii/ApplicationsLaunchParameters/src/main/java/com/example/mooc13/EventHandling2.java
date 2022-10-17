package com.example.mooc13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class EventHandling2 extends Application {

    public void start(Stage window) {
        TextField leftText = new TextField();
        TextField rightText = new TextField();
        Button button = new Button("Copy");

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });

        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene viewport = new Scene(componentGroup);

        window.setScene(viewport);
        window.show();
    }
    public static void main(String[] args) {
        launch(EventHandling2.class);
    }
}
