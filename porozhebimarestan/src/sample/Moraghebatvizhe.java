package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Moraghebatvizhe implements Initializable {




    @FXML
    ImageView imagemoraghebat;






    @FXML
    Button didanlistbimaranmoraghebatvizhe;


    @FXML
    Button taidlistbimaranmoraghebatvizhe;


    @FXML
    Label listbimaranmoraghebatvizhe;





    public void initialize(URL location, ResourceBundle resources){







        paziresh p=new paziresh();


        didanlistbimaranmoraghebatvizhe.setOnAction((e)->{




            try {

                Scanner sc=new Scanner(p.filemoraghebatvizhe);




                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }




                listbimaranmoraghebatvizhe.setText(matnbasetare);






            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });










        taidlistbimaranmoraghebatvizhe.setOnAction((e)->{





            try {

                Scanner sc=new Scanner(p.filemoraghebatvizhe);




                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }



                StringTokenizer st=new StringTokenizer(matnbasetare,"*");


                String matnbisetare="";

                while (st.hasMoreTokens()){

                    matnbisetare=matnbisetare+st.nextToken();

                }


                listbimaranmoraghebatvizhe.setText(matnbisetare);




                FileWriter fwmoraghebatvizhe=new FileWriter(p.filemoraghebatvizhe);

                fwmoraghebatvizhe.write(matnbisetare);

                fwmoraghebatvizhe.flush();
                fwmoraghebatvizhe.close();




            } catch (Exception ex) {
                ex.printStackTrace();
            }








        });









    }


}
