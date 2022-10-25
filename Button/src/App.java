
/**
 *
 * @author anggarasaputra
 */

// Java program to create a button and add event handler to it
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.collections.*;
import javafx.scene.text.Text.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

public class App extends Application {

    public void start(Stage PrimaryS)
    {
        PrimaryS.setTitle("create button");
        TilePane Pane = new TilePane();

        Label l = new Label("This Button");

        Button x = new Button("button");
        Button y = new Button("Button2");

        Pane.getChildren().add(x);
        Pane.getChildren().add(y);

        Scene Now = new Scene(Pane, 400, 400);

        PrimaryS.setScene(Now);
        PrimaryS.show();
    }

    public static void main(String args[])
    {
        launch(args);
    }
}