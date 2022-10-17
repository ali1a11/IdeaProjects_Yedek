package com.example.javafx_1;

import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImageApplication extends Application {

    @Override
    public void start(Stage stage) {

        Image imageFile = new Image("file:humming.jpg");
        ImageView image = new ImageView(imageFile);

        Pane frame = new Pane();
        frame.getChildren().add(image);

        stage.setScene(new Scene(frame));
        stage.show();

    }




    public static void main(String[] args) {
        launch(args);
    }
}
