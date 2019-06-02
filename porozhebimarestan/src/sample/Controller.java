package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;


import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    GridPane rangekollemenuasli;


    @FXML
    AnchorPane menuasli;

    @FXML
    ImageView image;

    @FXML
    RadioButton entekhabpaziresh;

    @FXML
    RadioButton entekhabdoctor;

    @FXML
    RadioButton entekhabraisbimarestan;


    @FXML
    Button taidmenuasli;


    @FXML
    RadioButton vahedhayebimarestani;


    @FXML
    RadioButton entekhabparastar;


    @FXML
    RadioButton entekhabtalkhis;









    public void initialize(URL location, ResourceBundle resources){


        ToggleGroup tg=new ToggleGroup();

        entekhabraisbimarestan.setToggleGroup(tg);
        entekhabpaziresh.setToggleGroup(tg);
        entekhabdoctor.setToggleGroup(tg);
        vahedhayebimarestani.setToggleGroup(tg);
        entekhabparastar.setToggleGroup(tg);
        entekhabtalkhis.setToggleGroup(tg);






        taidmenuasli.setOnAction((e)->{


            if(entekhabpaziresh.isSelected()){

                Mainpaziresh m=new Mainpaziresh();

                //menuasli.setVisible(false);

                //rangekollemenuasli.setVisible(false);

                m.paziresh();



            }






            if(entekhabdoctor.isSelected()){

                Maindoctor m=new Maindoctor();


                m.doctor();

            }





            if(entekhabraisbimarestan.isSelected()){

                Mainrais m=new Mainrais();


                m.rais();

            }






            if(vahedhayebimarestani.isSelected()){


                Mainvahedhayebimarestan m=new Mainvahedhayebimarestan();

                m.vahedhayebimarestan();



            }








            if(entekhabparastar.isSelected()){

                Mainparastar m=new Mainparastar();

                m.parastar();



            }









            if(entekhabtalkhis.isSelected()){


                Maintalkhis m=new Maintalkhis();

                m.talkhis();



            }







        });






    }





}
