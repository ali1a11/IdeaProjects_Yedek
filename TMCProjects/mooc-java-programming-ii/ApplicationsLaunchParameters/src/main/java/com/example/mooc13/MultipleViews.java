package com.example.mooc13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        BorderPane firstLayout = new BorderPane();
        VBox secondLayout = new VBox();
        GridPane thirdLayout = new GridPane();

        Scene first = new Scene(firstLayout);
        Scene second = new Scene(secondLayout);
        Scene third = new Scene(thirdLayout);

        //
        Label text = new Label("First view!");
        Button button1 = new Button("To the second view!");

        firstLayout.setTop(text);
        firstLayout.setCenter(button1);

        button1.setOnAction((event) -> {
            window.setScene(second);
        });

        //
        Button button2 = new Button("To the third view!");
        Label text2 = new Label("Second view!");

        secondLayout.getChildren().add(button2);
        secondLayout.getChildren().add(text2);

        button2.setOnAction((event) -> {
            window.setScene(third);
        });

        //
        Label text3 = new Label("Third view!");
        Button button3 = new Button("To the first view!");

        thirdLayout.add(text3, 0, 0);
        thirdLayout.add(button3,1, 1);

        button3.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
