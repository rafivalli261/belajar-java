
package variable;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CobaJavaFX extends Application {
    // @Override // Override the start method in the application class
    public void start(Stage primarystage){
        Button btOK = new Button("Hallo Dunia");
        Scene scene = new Scene(btOK, 250, 200);
        primarystage.setTitle("MencobaJavaGUI/FX");
        primarystage.setScene(scene);
        primarystage.show();
    }
    public static void main(String args[]) {
        // TODO code application logic here
        Application.launch(args);
    }
}
