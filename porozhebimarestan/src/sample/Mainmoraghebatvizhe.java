package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Mainmoraghebatvizhe extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

    }



    public void moraghebatvizhe(){



        Stage s = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("moraghebatvizhe.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        s.setTitle("مراقبت ویژه");
        s.setScene(new Scene(root, 600, 600));
        s.show();




    }


}
