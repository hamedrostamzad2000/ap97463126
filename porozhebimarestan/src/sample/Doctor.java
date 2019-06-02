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
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Doctor implements Initializable {


    @FXML
    AnchorPane tainedoctor;

    @FXML
    TextField usernamedoctor;

    @FXML
    PasswordField passworddoctor;

    @FXML
    Button taidramzedoctor;



    @FXML
    AnchorPane doktor1;


    @FXML
    Button didanlistdoktor1;

    @FXML
    Button taidlistbimarandoktor1;

    @FXML
    Label listbimarandoktor1;

    @FXML
    Label moarefidoctor1;





    @FXML
    AnchorPane doktor2;

    @FXML
    Button didanlistdoktor2;

    @FXML
    Button taidlistbimarandoktor2;

    @FXML
    Label listbimarandoktor2;

    @FXML
    Label moarefidoctor2;











    @FXML
    AnchorPane doktor3;


    @FXML
    Button didanlistdoktor3;

    @FXML
    Button taidlistbimarandoktor3;

    @FXML
    Label listbimarandoktor3;

    @FXML
    Label moarefidoctor3;







    String esmdoctor1;
    String esmdoctor2;
    String esmdoctor3;
    String esmparastar1;
    String esmparastar2;
    String esmparastar3;



    public void initialize(URL location, ResourceBundle resources){

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



        taidramzedoctor.setOnAction((e)->{

            int password=Integer.parseInt(passworddoctor.getText());
            String username=usernamedoctor.getText();




            if(username.compareTo(esmdoctor1)==0 && password==1){
                tainedoctor.setVisible(false);
                doktor1.setVisible(true);


                moarefidoctor1.setText("دکتر"+esmdoctor1);



            }







            if(username.compareTo(esmdoctor2)==0 && password==2){
                tainedoctor.setVisible(false);
                doktor2.setVisible(true);


                moarefidoctor2.setText("دکتر"+esmdoctor2);


            }






            if(username.compareTo(esmdoctor3)==0 && password==3){
                tainedoctor.setVisible(false);
                doktor3.setVisible(true);


                moarefidoctor3.setText("دکتر"+esmdoctor3);


            }






        });
























































        paziresh p=new paziresh();





        didanlistdoktor1.setOnAction((e)->{




            Scanner sc= null;
            try {

                sc = new Scanner(p.filedoctor1);


                String matndoktor="";

                while(sc.hasNext()) {
                    matndoktor=matndoktor+sc.nextLine()+"\n";

                }



                listbimarandoktor1.setText(matndoktor);



            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }



        });






        taidlistbimarandoktor1.setOnAction((e)->{


            try {



                Scanner sc=new Scanner(p.filedoctor1);

                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }



                StringTokenizer st=new StringTokenizer(matnbasetare,"*");


                String matnbisetare="";

                while (st.hasMoreTokens()){

                        matnbisetare=matnbisetare+st.nextToken();

                }


                listbimarandoktor1.setText(matnbisetare);




                FileWriter fwdoctor1=new FileWriter(p.filedoctor1);

                fwdoctor1.write(matnbisetare);

                fwdoctor1.flush();
                fwdoctor1.close();



            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });
























































        didanlistdoktor2.setOnAction((e)->{




            Scanner sc= null;
            try {

                sc = new Scanner(p.filedoctor2);


                String matndoktor="";

                while(sc.hasNext()) {
                    matndoktor=matndoktor+sc.nextLine()+"\n";

                }



                listbimarandoktor2.setText(matndoktor);



            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }



        });






        taidlistbimarandoktor2.setOnAction((e)->{


            try {



                Scanner sc=new Scanner(p.filedoctor2);

                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }



                StringTokenizer st=new StringTokenizer(matnbasetare,"*");


                String matnbisetare="";

                while (st.hasMoreTokens()){

                    matnbisetare=matnbisetare+st.nextToken();

                }


                listbimarandoktor2.setText(matnbisetare);




                FileWriter fwdoctor2=new FileWriter(p.filedoctor2);

                fwdoctor2.write(matnbisetare);

                fwdoctor2.flush();
                fwdoctor2.close();



            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });





















































        didanlistdoktor3.setOnAction((e)->{




            Scanner sc= null;
            try {

                sc = new Scanner(p.filedoctor3);


                String matndoktor="";

                while(sc.hasNext()) {
                    matndoktor=matndoktor+sc.nextLine()+"\n";

                }



                listbimarandoktor3.setText(matndoktor);



            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }



        });






        taidlistbimarandoktor3.setOnAction((e)->{


            try {



                Scanner sc=new Scanner(p.filedoctor3);

                String matnbasetare="";

                while (sc.hasNext()) {


                    matnbasetare = matnbasetare + sc.nextLine() + "\n";


                }



                StringTokenizer st=new StringTokenizer(matnbasetare,"*");


                String matnbisetare="";

                while (st.hasMoreTokens()){

                    matnbisetare=matnbisetare+st.nextToken();

                }


                listbimarandoktor3.setText(matnbisetare);




                FileWriter fwdoctor3=new FileWriter(p.filedoctor3);

                fwdoctor3.write(matnbisetare);

                fwdoctor3.flush();
                fwdoctor3.close();


            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });

































    }

}
