package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import sun.misc.Cache;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class Rais implements Initializable {


    @FXML
    AnchorPane safhetaidrais;


    @FXML
    TextField daryaftusernamerais;

    @FXML
    PasswordField passwordrais;

    @FXML
    Button taidpasswordrais;





    @FXML
    AnchorPane safhedoctorhavaparastarha;

    @FXML
    TextField doctor1;

    @FXML
    TextField doctor2;

    @FXML
    TextField doctor3;



    @FXML
    TextField parastar1;

    @FXML
    TextField parastar2;

    @FXML
    TextField parastar3;




    @FXML
    Button taidestekhdamedoctorha;



    @FXML
    Button didaneestekhdamedoctorha;






    File fileestekhdamedoctorha=new File("D:/estekhdamdoctorha.dat");




    public void initialize(URL Location, ResourceBundle resources) {





        taidpasswordrais.setOnAction((e)->{


            String usernamerais=daryaftusernamerais.getText();

            int password=Integer.parseInt(passwordrais.getText());






            if(usernamerais.compareTo("hamed")==0 && password==1){


                safhetaidrais.setVisible(false);

                safhedoctorhavaparastarha.setVisible(true);



            }





        });














        didaneestekhdamedoctorha.setOnAction((e)->{



            Scanner sc = null;
            try {

                sc = new Scanner(fileestekhdamedoctorha);


                while (sc.hasNext()) {

                    doctor1.setText(sc.nextLine());

                    doctor2.setText(sc.nextLine());

                    doctor3.setText(sc.nextLine());

                    parastar1.setText(sc.nextLine());

                    parastar2.setText(sc.nextLine());

                    parastar3.setText(sc.nextLine());

                }


                sc.close();


            } catch (FileNotFoundException et) {
                et.printStackTrace();
            }





        });













        taidestekhdamedoctorha.setOnAction((e)->{



            try {


                FileWriter fwestekhdamedoctorhavaparastarha=new FileWriter(fileestekhdamedoctorha);


                //String doctor11=doctor1.getText();

                fwestekhdamedoctorhavaparastarha.write(doctor1.getText()+"\n");

                //String doctor22=doctor2.getText();

                fwestekhdamedoctorhavaparastarha.write(doctor2.getText()+"\n");

                //String doctor33=doctor3.getText();

                fwestekhdamedoctorhavaparastarha.write(doctor3.getText()+"\n");



                fwestekhdamedoctorhavaparastarha.write(parastar1.getText()+"\n");

                fwestekhdamedoctorhavaparastarha.write(parastar2.getText()+"\n");

                fwestekhdamedoctorhavaparastarha.write(parastar3.getText()+"\n");


                fwestekhdamedoctorhavaparastarha.flush();
                fwestekhdamedoctorhavaparastarha.close();


            } catch (IOException ei) {
                ei.printStackTrace();
            }


        });



    }



}
