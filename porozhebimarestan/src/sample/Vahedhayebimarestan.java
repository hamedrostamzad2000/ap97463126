package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Vahedhayebimarestan implements Initializable {



    @FXML
    Button entekhaborgans;


    @FXML
    Button entekhabsterilize;

    @FXML
    Button entekhabmoraghebatvizhe;



    public void initialize(URL location, ResourceBundle resources) {




        entekhaborgans.setOnAction((e)->{

            Mainorgans m=new Mainorgans();

            m.organs();

        });






        entekhabsterilize.setOnAction((e)->{


            Mainsterilize m=new Mainsterilize();

            m.sterilize();



        });








        entekhabmoraghebatvizhe.setOnAction((e)->{



            Mainmoraghebatvizhe m=new Mainmoraghebatvizhe();

            m.moraghebatvizhe();


        });




    }



}
