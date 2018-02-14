package encapsulation;
 
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
 
 
public class KalkulatorApp extends Application {
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KalkulatorApp.class.getResource("KalkulatorApp.fxml"));
        Pane root = fxmlLoader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(KalkulatorApp.class, args);
    }
}