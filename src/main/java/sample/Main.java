package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage stg;  // creates top level JavaFX container

    @Override
    public void start(Stage primaryStage) throws Exception{
        stg =primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("styles/login.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("styles/filestyle.css").toExternalForm());
        primaryStage.setTitle("CV Maker");
        primaryStage.show();
       primaryStage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
