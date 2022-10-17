package com.example.mooc13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatisticsApplication2 extends Application {

    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label longest = new Label("The longest word is: ");
        TextArea text = new TextArea();
        //TextField text = new TextField();

        HBox labels  =new HBox();
        labels.setSpacing(15);
        labels.getChildren().add(letters);
        labels.getChildren().add(words);
        labels.getChildren().add(longest);

        layout.setCenter(text);
        layout.setBottom(labels);

        // Change Listener -> Lambda
        /*
        text.textProperty().addListener((change, oldValue, newValue) -> {
            System.out.println(oldValue + " -> " + newValue);
            rightText.setText(newValue);
        });
         */

        text.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int wordsCount = parts.length;
            String longestWord = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of text elements
            // System.out.println(oldValue + " -> " + newValue);
            // rightText.setText(newValue);

            letters.setText("Letters: " + characters);
            words.setText("Words: " + wordsCount);
            longest.setText("The longest word is: " + longestWord);

        });

        Scene viewport = new Scene(layout);

        window.setScene(viewport);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication2.class);
    }
}
