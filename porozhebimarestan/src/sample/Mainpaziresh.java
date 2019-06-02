package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Mainpaziresh extends Application {

    @Override
    public void start(Stage s) throws Exception{

    }


    public void paziresh () {
        //launch(args);


        Stage s = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Paziresh.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        s.setTitle("پذیرش");
        s.setScene(new Scene(root, 600, 600));
        s.show();


    }
}
