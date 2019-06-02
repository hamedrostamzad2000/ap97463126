package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class paziresh implements Initializable{


    @FXML
    AnchorPane menupaziresh;


    @FXML
    CheckBox mard;


    @FXML
    TextField namebimar;

    @FXML
    TextField shomaretabaghe;

    @FXML
    TextField shomareotagh;

    @FXML
    TextField shomaretakht;

    @FXML
    CheckBox zan;


    @FXML
    Button taidpaziresh;

    @FXML
    RadioButton pardakhtepol;


    @FXML
    RadioButton doctor1;

    @FXML
    RadioButton doctor2;

    @FXML
    RadioButton doctor3;


    @FXML
    RadioButton organs;


    @FXML
    RadioButton sterilize;


    @FXML
    RadioButton moraghebatvizhe;


    @FXML
    RadioButton parastar1;

    @FXML
    RadioButton parastar2;

    @FXML
    RadioButton parastar3;


    @FXML
    Button moshahedelistpaziresh;





    @FXML
    AnchorPane safhelistpaziresh;

    @FXML
    Label listpaziresh;





    File filepaziresh=new File("D:/paziresh.dat");


    File filedoctor1=new File("D:/doctor1.dat");

    File filedoctor2=new File("D:/doctor2.dat");

    File filedoctor3=new File("D:/doctor3.dat");




    File fileorgans=new File("D:/organs.dat");

    File filesterilize=new File("D:/sterilize.dat");

    File filemoraghebatvizhe=new File("D:/moraghebatvizhe.dat");



    File fileparastar1=new File("D:/parastar1.dat");

    File fileparastar2=new File("D:/parastar2.dat");

    File fileparastar3=new File("D:/parastar3.dat");











    public void initialize(URL Location, ResourceBundle resources) {




        Rais r=new Rais();

        try {

            Scanner sc=new Scanner(r.fileestekhdamedoctorha);



            while (sc.hasNext()){

                doctor1.setText("پزشک ۱:"+sc.nextLine());
                doctor2.setText("پزشک ۲:"+sc.nextLine());
                doctor3.setText("پزشک ۳:"+sc.nextLine());

                parastar1.setText("پرستار ۱:"+sc.nextLine());
                parastar2.setText("پرستار ۲:"+sc.nextLine());
                parastar3.setText("پرستار ۳:"+sc.nextLine());




            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }








        ToggleGroup vahedha=new ToggleGroup();


        organs.setToggleGroup(vahedha);
        moraghebatvizhe.setToggleGroup(vahedha);
        sterilize.setToggleGroup(vahedha);





        ToggleGroup parastarha=new ToggleGroup();


        parastar1.setToggleGroup(parastarha);
        parastar2.setToggleGroup(parastarha);
        parastar3.setToggleGroup(parastarha);




        ToggleGroup doctorha=new ToggleGroup();


        doctor1.setToggleGroup(doctorha);
        doctor2.setToggleGroup(doctorha);
        doctor3.setToggleGroup(doctorha);







        taidpaziresh.setOnAction((e)->{

            String esmbimar=namebimar.getText();
            int tabagheotaghtakht=Integer.parseInt(shomaretabaghe.getText()+shomareotagh.getText()+shomaretakht.getText());



            try {


                FileWriter fwpaziresh=new FileWriter(filepaziresh,true);




                FileWriter fwdoctor1=new FileWriter(filedoctor1,true);

                FileWriter fwdoctor2=new FileWriter(filedoctor2,true);

                FileWriter fwdoctor3=new FileWriter(filedoctor3,true);



                FileWriter fworgans=new FileWriter(fileorgans,true);

                FileWriter fwsterilize=new FileWriter(filesterilize,true);

                FileWriter fwmoraghebatvizhe=new FileWriter(filemoraghebatvizhe,true);



                FileWriter fwparastar1=new FileWriter(fileparastar1,true);

                FileWriter fwparastar2=new FileWriter(fileparastar2,true);

                FileWriter fwparastar3=new FileWriter(fileparastar3,true);





                fwpaziresh.write("\n"+" نام بیمار" + esmbimar + "\t");
                fwpaziresh.write(" شماره تخت"+tabagheotaghtakht+"\t");

                if(mard.isSelected()){
                    fwpaziresh.write("مرد:جنسیت"+"\t");
                }

                if(zan.isSelected()){
                    fwpaziresh.write("زن:جنسیت"+"\t");
                }


                if(pardakhtepol.isSelected()){

                    fwpaziresh.write("*\n");

                }

                fwpaziresh.flush();
                fwpaziresh.close();















                if(doctor1.isSelected()) {


                    fwdoctor1.write("\n"+" نام بیمار" + esmbimar + "\t");
                    fwdoctor1.write(" شماره تخت" + tabagheotaghtakht + "\t");

                    if (mard.isSelected()) {
                        fwdoctor1.write("مرد:جنسیت" + "\t");
                    }

                    if (zan.isSelected()) {
                        fwdoctor1.write("زن:جنسیت" + "\t");
                    }


                    if (pardakhtepol.isSelected()) {

                        fwdoctor1.write("*\n");

                    }

                    fwdoctor1.flush();
                    fwdoctor1.close();

                }




















                if(doctor2.isSelected()) {


                    fwdoctor2.write("\n"+" نام بیمار" + esmbimar + "\t");
                    fwdoctor2.write(" شماره تخت" + tabagheotaghtakht + "\t");

                    if (mard.isSelected()) {
                        fwdoctor2.write("مرد:جنسیت" + "\t");
                    }

                    if (zan.isSelected()) {
                        fwdoctor2.write("زن:جنسیت" + "\t");
                    }


                    if (pardakhtepol.isSelected()) {

                        fwdoctor2.write("*\n");

                    }

                    fwdoctor2.flush();
                    fwdoctor2.close();

                }






















                if(doctor3.isSelected()) {


                    fwdoctor3.write("\n"+" نام بیمار" + esmbimar + "\t");
                    fwdoctor3.write(" شماره تخت" + tabagheotaghtakht + "\t");

                    if (mard.isSelected()) {
                        fwdoctor3.write("مرد:جنسیت" + "\t");
                    }

                    if (zan.isSelected()) {
                        fwdoctor3.write("زن:جنسیت" + "\t");
                    }


                    if (pardakhtepol.isSelected()) {

                        fwdoctor3.write("*\n");

                    }

                    fwdoctor3.flush();
                    fwdoctor3.close();

                }
















                if(organs.isSelected()) {


                    fworgans.write("\n"+" نام بیمار" + esmbimar + "\t");
                    fworgans.write(" شماره تخت" + tabagheotaghtakht + "\t");

                    if (mard.isSelected()) {
                        fworgans.write("مرد:جنسیت" + "\t");
                    }

                    if (zan.isSelected()) {
                        fworgans.write("زن:جنسیت" + "\t");
                    }


                    if (pardakhtepol.isSelected()) {

                        fworgans.write("*\n");

                    }

                    fworgans.flush();
                    fworgans.close();

                }














                if(sterilize.isSelected()) {


                    fwsterilize.write("\n"+" نام بیمار" + esmbimar + "\t");
                    fwsterilize.write(" شماره تخت" + tabagheotaghtakht + "\t");

                    if (mard.isSelected()) {
                        fwsterilize.write("مرد:جنسیت" + "\t");
                    }

                    if (zan.isSelected()) {
                        fwsterilize.write("زن:جنسیت" + "\t");
                    }


                    if (pardakhtepol.isSelected()) {

                        fwsterilize.write("*\n");

                    }

                    fwsterilize.flush();
                    fwsterilize.close();

                }













                if(moraghebatvizhe.isSelected()) {


                    fwmoraghebatvizhe.write("\n"+" نام بیمار" + esmbimar + "\t");
                    fwmoraghebatvizhe.write(" شماره تخت" + tabagheotaghtakht + "\t");

                    if (mard.isSelected()) {
                        fwdoctor1.write("مرد:جنسیت" + "\t");
                    }

                    if (zan.isSelected()) {
                        fwmoraghebatvizhe.write("زن:جنسیت" + "\t");
                    }


                    if (pardakhtepol.isSelected()) {

                        fwmoraghebatvizhe.write("*\n");

                    }

                    fwmoraghebatvizhe.flush();
                    fwmoraghebatvizhe.close();

                }














                if(parastar1.isSelected()) {


                    fwparastar1.write("\n"+" نام بیمار" + esmbimar + "\t");
                    fwparastar1.write(" شماره تخت" + tabagheotaghtakht + "\t");

                    if (mard.isSelected()) {
                        fwparastar1.write("مرد:جنسیت" + "\t");
                    }

                    if (zan.isSelected()) {
                        fwparastar1.write("زن:جنسیت" + "\t");
                    }


                    if (pardakhtepol.isSelected()) {

                        fwparastar1.write("*\n");

                    }

                    fwparastar1.flush();
                    fwparastar1.close();

                }












                if(parastar2.isSelected()) {


                    fwparastar2.write("\n"+" نام بیمار" + esmbimar + "\t");
                    fwparastar2.write(" شماره تخت" + tabagheotaghtakht + "\t");

                    if (mard.isSelected()) {
                        fwparastar2.write("مرد:جنسیت" + "\t");
                    }

                    if (zan.isSelected()) {
                        fwparastar2.write("زن:جنسیت" + "\t");
                    }


                    if (pardakhtepol.isSelected()) {

                        fwparastar2.write("*\n");

                    }

                    fwparastar2.flush();
                    fwparastar2.close();

                }














                if(parastar3.isSelected()) {


                    fwparastar3.write("\n"+" نام بیمار" + esmbimar + "\t");
                    fwparastar3.write(" شماره تخت" + tabagheotaghtakht + "\t");

                    if (mard.isSelected()) {
                        fwparastar3.write("مرد:جنسیت" + "\t");
                    }

                    if (zan.isSelected()) {
                        fwparastar3.write("زن:جنسیت" + "\t");
                    }


                    if (pardakhtepol.isSelected()) {

                        fwparastar3.write("*\n");

                    }

                    fwparastar3.flush();
                    fwparastar3.close();

                }











            } catch (IOException ex) {
                ex.printStackTrace();
            }















        });
















        moshahedelistpaziresh.setOnAction((e)->{



            menupaziresh.setVisible(false);

            safhelistpaziresh.setVisible(true);





            try {

                Scanner sc=new Scanner(filepaziresh);

                String listbimaranpaziresh="";

                while(sc.hasNext()) {
                    listbimaranpaziresh=listbimaranpaziresh+sc.nextLine()+"\n";

                }



                listpaziresh.setText(listbimaranpaziresh);


            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }


        });














    }
}
































/*import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.stage.Stage;

public class FXMLMultilingualExample extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage = FXMLLoader.load(getClass().getResource("/FXMLMultilingual.fxml"));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}





























import java.io.UnsupportedEncodingException;
        import java.net.URL;
        import java.util.Locale;
        import java.util.ResourceBundle;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.stage.Stage;

public class FXMLMultilingualController implements Initializable {
    ResourceBundle enBundle;
    ResourceBundle faBundle;

    @FXML
    private Stage stage;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Button btn1;

    @FXML
    private void toEnglish(ActionEvent event) {
        setText(enBundle);
    }

    @FXML
    private void toFarsi(ActionEvent event) {
        setText(faBundle);
    }

    void setText(ResourceBundle bundle) {

        stage.setTitle(getUTF(bundle.getString("app.title")));
        lbl1.setText(getUTF(bundle.getString("lbl1.text")));
        lbl2.setText(getUTF(bundle.getString("lbl2.text")));
        btn1.setText(getUTF(bundle.getString("btn1.text")));

    }

    public String getUTF(String s) {
        try {
            return new String(s.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Locale enLocale = new Locale("en", "US");
        Locale faLocale = new Locale("fa", "IR");

        enBundle = ResourceBundle.getBundle("mystrings", enLocale);
        faBundle = ResourceBundle.getBundle("mystrings", faLocale);

        setText(enBundle);
    }

}

































    <?xml version="1.0" encoding="UTF-8"?>
<?import java.lang.*?>
<?import java.util.*?>
<?import javafx.scene.*?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>
<?import javafx.geometry.*?>
<?import javafx.stage.Stage?>
<Stage fx:id="stage" title="some title" xmlns:fx="http://javafx.com/fxml/1" fx:controller="FXMLMultilingualController">
<scene>
<Scene>
<VBox id="AnchorPane" spacing="10" prefHeight="200" prefWidth="300" alignment="top_center">
<padding>
<Insets top="8" right="8" bottom="8" left="8" />
</padding>
<children>
<Label fx:id="lbl1" />
<Label fx:id="lbl2" />
<Button fx:id="btn1" />
<Button text="English" onAction="#toEnglish" fx:id="btnEnglish" />
<Button text="فارسی" onAction="#toFarsi" fx:id="btnFarsi" />
</children>
</VBox>
</Scene>
</scene>
</Stage>
*/
