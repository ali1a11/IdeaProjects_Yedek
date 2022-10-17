package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatisticsApplication extends Application {

    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label longest = new Label("The longest word is: ");
        TextArea text = new TextArea();
        //TextField text = new TextField();

        HBox labels = new HBox();
        labels.setSpacing(15);
        labels.getChildren().add(letters);
        labels.getChildren().add(words);
        labels.getChildren().add(longest);

        layout.setCenter(text);
        layout.setBottom(labels);

        text.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int wordsCount = parts.length;
            String longestWord = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of text elements

            letters.setText("Letters: " + characters);
            words.setText("Words: " + wordsCount);
            longest.setText("The longest word is: " + longestWord);

        });

        Scene viewport = new Scene(layout);

        window.setScene(viewport);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}

/* from mooc
package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        TextArea textBox = new TextArea();
        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is: ");

        BorderPane componentGroup = new BorderPane();
        componentGroup.setCenter(textBox);

        HBox hbox = new HBox();
        hbox.setSpacing(20);
        hbox.getChildren().add(lettersLabel);
        hbox.getChildren().add(wordsLabel);
        hbox.getChildren().add(longestWordLabel);

        componentGroup.setBottom(hbox);

        textBox.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            lettersLabel.setText("Letters: " + characters);
            wordsLabel.setText("Words: " + words);
            longestWordLabel.setText("The longest word is: " + longest);
        });

        Scene viewport = new Scene(componentGroup);

        stage.setScene(viewport);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

}
 */