package gui_liang;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class ShowBorderPane extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage babak) {
        // Create a border pane
        BorderPane pane = new BorderPane();

        // Place node in the pane 
        pane.setTop(new CustomPane("Top"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setRight(new CustomPane("Right"));
        pane.setLeft(new CustomPane("Left"));
        pane.setCenter(new CustomPane("Center"));

        // Create a scene and place it in the stage
        Scene sin = new Scene(pane);
        babak.setTitle("ShowBorderPane");  // set the stage title
        babak.setScene(sin); // place the scene in the stage
        babak.show(); // display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

class CustomPane extends StackPane {

    public CustomPane(String title) {
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: red");
        setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    }
}
