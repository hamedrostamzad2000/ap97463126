package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Mainsterilize extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

    }



    public void sterilize(){


        Stage s = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("sterilize.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        s.setTitle("اتاق استریلیزه");
        s.setScene(new Scene(root, 600, 600));
        s.show();

    }



}
