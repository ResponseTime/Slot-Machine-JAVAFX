package slot;
import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
public class slot extends Application{
    public void start(Stage stage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ui.fxml"));
        Scene scene = new Scene(root);
        File ima = new File("C:/Users/callr/Downloads/4338747.png");
        String im = ima.toURI().toString();
        Image icon = new Image(im);
        stage.setTitle("Slot Machine");
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
