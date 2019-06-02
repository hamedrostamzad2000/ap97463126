package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sterilize implements Initializable {




    @FXML
    Button didanlistbimaransterilize;


    @FXML
    Button taidlistbimaransterilize;


    @FXML
    Label listbimaransterilize;








    public void initialize(URL location, ResourceBundle resources) {




        paziresh p=new paziresh();


        didanlistbimaransterilize.setOnAction((e)->{




            try {

                Scanner sc=new Scanner(p.filesterilize);




                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }




                listbimaransterilize.setText(matnbasetare);






            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });










        taidlistbimaransterilize.setOnAction((e)->{





            try {

                Scanner sc=new Scanner(p.filesterilize);




                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }



                StringTokenizer st=new StringTokenizer(matnbasetare,"*");


                String matnbisetare="";

                while (st.hasMoreTokens()){

                    matnbisetare=matnbisetare+st.nextToken();

                }


                listbimaransterilize.setText(matnbisetare);




                FileWriter fwsterilize=new FileWriter(p.filesterilize);

                fwsterilize.write(matnbisetare);

                fwsterilize.flush();
                fwsterilize.close();




            } catch (Exception ex) {
                ex.printStackTrace();
            }








        });
















    }
}
