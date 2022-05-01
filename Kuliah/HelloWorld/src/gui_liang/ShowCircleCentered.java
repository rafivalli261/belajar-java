package gui_liang;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a new pane to hold the circle
        Pane bingkai = new Pane();

        // Create a circle and set its properties
        Circle lingkaran = new Circle();
        lingkaran.centerXProperty().bind(bingkai.widthProperty().divide(2));
        lingkaran.centerYProperty().bind(bingkai.heightProperty().divide(2));
        lingkaran.setRadius(50);
        lingkaran.setStroke(Color.BLACK);
        lingkaran.setFill(Color.WHITE);
        bingkai.getChildren().add(lingkaran); // Add circle to the pane

        // Create a scene and place it in the stage
        Scene babak = new Scene(bingkai, 400, 400);
        primaryStage.setTitle("ShowCircleCentered"); // Set the stage title
        primaryStage.setScene(babak); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
