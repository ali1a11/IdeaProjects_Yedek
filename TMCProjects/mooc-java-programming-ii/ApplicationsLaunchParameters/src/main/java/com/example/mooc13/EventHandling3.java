package com.example.mooc13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class EventHandling3 extends Application {

    public void start(Stage window) {
        TextField leftText = new TextField();
        TextField rightText = new TextField();
        Button button = new Button("Copy");

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });

        // Change Listener
        /*
        leftText.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> change,
                                String oldValue, String newValue) {

                System.out.println(oldValue + " -> " + newValue);
                rightText.setText(newValue);
            }
        });

         */

        // Change Listener -> Lambda

        leftText.textProperty().addListener((change, oldValue, newValue) -> {
            System.out.println(oldValue + " -> " + newValue);
            rightText.setText(newValue);
        });

        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene viewport = new Scene(componentGroup);

        window.setScene(viewport);
        window.show();
    }




    public static void main(String[] args) {
        launch(EventHandling3.class);
    }
}
