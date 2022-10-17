package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application{
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        layout.setTop(new Label("NORTH"));
        layout.setRight(new Label("EAST"));
        layout.setBottom(new Label("SOUTH"));
        //layout.setLeft(new Label("WEST"));


        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }
}

/*
package borderpane;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane componentGroup = new BorderPane();
        componentGroup.setTop(new Label("NORTH"));
        componentGroup.setRight(new Label("EAST"));
        componentGroup.setBottom(new Label("SOUTH"));

        Scene viewport = new Scene(componentGroup);

        stage.setScene(viewport);
        stage.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
        System.out.println("Hello world!");
    }

}
 */
