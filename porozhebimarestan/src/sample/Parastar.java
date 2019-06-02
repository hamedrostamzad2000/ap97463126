package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Parastar implements Initializable {




    @FXML
    AnchorPane taineparastar;




    @FXML
    TextField usernameparastar;



    @FXML
    PasswordField passwordparastar;



    @FXML
    Button taidramzeparastar;











    @FXML
    AnchorPane parastar1;


    @FXML
    Button didanlistbimaranparastar1;

    @FXML
    Button taidlistbimaranparastar1;

    @FXML
    Label listbimaranparastar1;

    @FXML
    Label moarefiparastar1;
















    @FXML
    AnchorPane parastar2;


    @FXML
    Button didanlistbimaranparastar2;

    @FXML
    Button taidlistbimaranparastar2;

    @FXML
    Label listbimaranparastar2;

    @FXML
    Label moarefiparastar2;









    @FXML
    AnchorPane parastar3;


    @FXML
    Button didanlistbimaranparastar3;

    @FXML
    Button taidlistbimaranparastar3;

    @FXML
    Label listbimaranparastar3;

    @FXML
    Label moarefiparastar3;





    String esmdoctor1;
    String esmdoctor2;
    String esmdoctor3;
    String esmparastar1;
    String esmparastar2;
    String esmparastar3;





    public void initialize(URL location, ResourceBundle resources) {





        Rais r=new Rais();



        try {

            Scanner sc=new Scanner(r.fileestekhdamedoctorha);



            while (sc.hasNext()){

                esmdoctor1=sc.nextLine();

                esmdoctor2=sc.nextLine();

                esmdoctor3=sc.nextLine();

                esmparastar1=sc.nextLine();

                esmparastar2=sc.nextLine();

                esmparastar3=sc.nextLine();


            }


        } catch (FileNotFoundException ei) {
            ei.printStackTrace();
        }













        taidramzeparastar.setOnAction((e)->{

            int password=Integer.parseInt(passwordparastar.getText());
            String username=usernameparastar.getText();




            if(username.compareTo(esmparastar1)==0 && password==1){
                taineparastar.setVisible(false);
                parastar1.setVisible(true);


                moarefiparastar1.setText("پرستار"+esmparastar1);

            }







            if(username.compareTo(esmparastar2)==0 && password==2){
                taineparastar.setVisible(false);
                parastar2.setVisible(true);



                moarefiparastar2.setText("پرستار"+esmparastar2);

            }






            if(username.compareTo(esmparastar3)==0 && password==3){
                taineparastar.setVisible(false);
                parastar3.setVisible(true);


                moarefiparastar3.setText("پرستار"+esmparastar3);
            }






        });
























































        paziresh p=new paziresh();





        didanlistbimaranparastar1.setOnAction((e)->{




            Scanner sc= null;
            try {

                sc = new Scanner(p.fileparastar1);


                String matndoktor="";

                while(sc.hasNext()) {
                    matndoktor=matndoktor+sc.nextLine()+"\n";

                }



                listbimaranparastar1.setText(matndoktor);



            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }



        });






        taidlistbimaranparastar1.setOnAction((e)->{


            try {



                Scanner sc=new Scanner(p.fileparastar1);

                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }



                StringTokenizer st=new StringTokenizer(matnbasetare,"*");


                String matnbisetare="";

                while (st.hasMoreTokens()){

                    matnbisetare=matnbisetare+st.nextToken();

                }


                listbimaranparastar1.setText(matnbisetare);




                FileWriter fwparastar1=new FileWriter(p.fileparastar1);

                fwparastar1.write(matnbisetare);

                fwparastar1.flush();
                fwparastar1.close();



            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });
























































        didanlistbimaranparastar2.setOnAction((e)->{




            Scanner sc= null;
            try {

                sc = new Scanner(p.fileparastar2);


                String matndoktor="";

                while(sc.hasNext()) {
                    matndoktor=matndoktor+sc.nextLine()+"\n";

                }



                listbimaranparastar2.setText(matndoktor);



            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }



        });






        taidlistbimaranparastar2.setOnAction((e)->{


            try {



                Scanner sc=new Scanner(p.fileparastar2);

                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }



                StringTokenizer st=new StringTokenizer(matnbasetare,"*");


                String matnbisetare="";

                while (st.hasMoreTokens()){

                    matnbisetare=matnbisetare+st.nextToken();

                }


                listbimaranparastar2.setText(matnbisetare);




                FileWriter fwparastar2=new FileWriter(p.filedoctor2);

                fwparastar2.write(matnbisetare);

                fwparastar2.flush();
                fwparastar2.close();



            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });





















































        didanlistbimaranparastar3.setOnAction((e)->{




            Scanner sc= null;
            try {

                sc = new Scanner(p.fileparastar3);


                String matndoktor="";

                while(sc.hasNext()) {
                    matndoktor=matndoktor+sc.nextLine()+"\n";

                }



                listbimaranparastar3.setText(matndoktor);



            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }



        });






        taidlistbimaranparastar3.setOnAction((e)->{


            try {



                Scanner sc=new Scanner(p.fileparastar3);

                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }



                StringTokenizer st=new StringTokenizer(matnbasetare,"*");


                String matnbisetare="";

                while (st.hasMoreTokens()){

                    matnbisetare=matnbisetare+st.nextToken();

                }


                listbimaranparastar3.setText(matnbisetare);




                FileWriter fwparastar3=new FileWriter(p.filedoctor3);

                fwparastar3.write(matnbisetare);

                fwparastar3.flush();
                fwparastar3.close();


            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });




































    }
}
