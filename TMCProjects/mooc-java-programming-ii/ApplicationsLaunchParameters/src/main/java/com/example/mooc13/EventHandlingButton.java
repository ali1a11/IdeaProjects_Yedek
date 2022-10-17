package com.example.mooc13;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventHandlingButton extends Application {
    public void start(Stage window) {
        /*
        Button buttonComponent = new Button("This is a button");

        // Event handling
        buttonComponent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed!");
            }
        });
         */
        //
        // Buttton with event handling by a Lambda expression
        Button buttonComponent = new Button("This is a button");
        buttonComponent.setOnAction((event) -> {
            System.out.println("Pressed!");
        });

        // Text field
        TextField textFieldComponent = new TextField();

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(buttonComponent);
        componentGroup.getChildren().add(textFieldComponent);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(EventHandlingButton.class);
    }
}

