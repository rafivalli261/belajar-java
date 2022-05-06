package gui_liang;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImage extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage mainStage) {
        // Create a pane to hold the image views
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
         Image image = new Image("gui_liang/xiao.png");
         pane.getChildren().add(new ImageView(image));

        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(540);
        imageView2.setFitWidth(960);
//        pane.getChildren().add(imageView2);

        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
//        pane.getChildren().add(imageView3);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        mainStage.setTitle("ShowImage"); // Set the stage title
        mainStage.setScene(scene); // Place the scene in the stage
        mainStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
