package com.example.mooc13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFxApplicationGridPane extends Application{
    @Override
    public void start(Stage window) {
        GridPane layout = new GridPane();

        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                layout.add(new Button("" + x + ", " + y), x, y);
            }
        }

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
        launch(JavaFxApplicationGridPane.class);
    }
}
