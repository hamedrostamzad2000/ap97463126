package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Mainorgans extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

    }


    public void organs(){

        Stage s = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("organs.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        s.setTitle("اورژانس");
        s.setScene(new Scene(root, 600, 600));
        s.show();

    }

}
