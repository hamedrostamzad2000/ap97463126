package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class Talkhis implements Initializable {


    @FXML
    Button taidtalkhis;

    @FXML
    TextField esmtalkhis;


    @FXML
    Label talkhislabel;






    String listtalkhisnashode;

    String listtalkhisshode;



    public void initialize(URL location, ResourceBundle resources) {








        paziresh p=new paziresh();



        taidtalkhis.setOnAction((e)->{












            try {

                Scanner sc=new Scanner(p.filepaziresh);


                while (sc.hasNext()){

                    listtalkhisnashode=listtalkhisnashode+sc.nextLine()+"\n";

                }


            } catch (FileNotFoundException ei) {
                ei.printStackTrace();
            }






            if(listtalkhisnashode.indexOf(esmtalkhis.getText())==-1){


                talkhislabel.setText("چنین اسمی در لیست وجود ندارد");

            }else {talkhislabel.setText(esmtalkhis.getText()+"با موفقیت ترخیص شد");}




            listtalkhisshode=listtalkhisnashode.replace(esmtalkhis.getText(),"ترخیص شد");



            //listtalkhisshode=listtalkhisnashode.replace("null","");




            try {

                FileWriter fwtalkhis=new FileWriter(p.filepaziresh,false);


                fwtalkhis.write(listtalkhisshode);


                fwtalkhis.flush();
                fwtalkhis.close();








            } catch (IOException ex) {
                ex.printStackTrace();
            }








        });





    }









}
