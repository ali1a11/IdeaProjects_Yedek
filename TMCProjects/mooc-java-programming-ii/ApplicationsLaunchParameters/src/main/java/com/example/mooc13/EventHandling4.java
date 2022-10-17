package com.example.mooc13;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class EventHandling4 extends Application {

    public void start(Stage window) {
        TextField leftText = new TextField();
        TextField rightText = new TextField();
        Button button = new Button("Copy");
        Label label = new Label();

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });

        // Change Listener -> Lambda
        /*
        leftText.textProperty().addListener((change, oldValue, newValue) -> {
            System.out.println(oldValue + " -> " + newValue);
            rightText.setText(newValue);
        });
         */

        leftText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of text elements
            System.out.println(oldValue + " -> " + newValue);
            //rightText.setText(newValue);
            rightText.setText(String.valueOf(characters));


        });



        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene viewport = new Scene(componentGroup);

        window.setScene(viewport);
        window.show();
    }




    public static void main(String[] args) {
        launch(EventHandling4.class);
    }
}
