package gui_liang;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowHBoxVbox extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage homeStage) {
        // Create a border pane
        BorderPane pane = new BorderPane();
        // Place nodes in the pane
        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        homeStage.setTitle("ShowHboxVbox"); // Set the stage title
        homeStage.setScene(scene); // Place the scene in the stage
        homeStage.show(); // Display the stage
    }

    private HBox getHBox() {
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        ImageView imageView = new ImageView(new Image("/gui_liang/xiao.png"));
        imageView.setFitHeight(540);
        imageView.setFitWidth(960);
        hBox.getChildren().add(imageView);

        return hBox;

    }

    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("Courses"));

        Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 2410"), new Label("CSCI 3720")};

        for (Label course : courses) {
            vBox.setMargin(course, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(course);
        }
        return vBox;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
