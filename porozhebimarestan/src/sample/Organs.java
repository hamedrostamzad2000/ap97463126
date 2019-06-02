package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.StringTokenizer;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Organs implements Initializable {



    @FXML
    Button didanlistbimaranorgans;


    @FXML
    Button taidlistbimaranorgans;


    @FXML
    Label listbimaranorgans;




    public void initialize(URL Location, ResourceBundle resources) {




        paziresh p=new paziresh();


        didanlistbimaranorgans.setOnAction((e)->{




            try {

                Scanner sc=new Scanner(p.fileorgans);




                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }




                listbimaranorgans.setText(matnbasetare);






            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });










        taidlistbimaranorgans.setOnAction((e)->{





            try {

                Scanner sc=new Scanner(p.fileorgans);




                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }



                StringTokenizer st=new StringTokenizer(matnbasetare,"*");


                String matnbisetare="";

                while (st.hasMoreTokens()){

                    matnbisetare=matnbisetare+st.nextToken();

                }


                listbimaranorgans.setText(matnbisetare);




                FileWriter fworgans=new FileWriter(p.fileorgans);

                fworgans.write(matnbisetare);

                fworgans.flush();
                fworgans.close();




            } catch (Exception ex) {
                ex.printStackTrace();
            }








        });







    }


}
