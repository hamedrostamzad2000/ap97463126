package assignment4;




import java.util.Scanner;
import java.util.Random;


public class assignment4 {




    public static void main(String[] args) {


        Integer satraraye=0;
        Integer sotonaraye=0;










        System.out.println("TEDAD SATR RA VARED KONID :");

        Scanner input=new Scanner(System.in);

        satraraye=input.nextInt();


        System.out.println("TEDAD SOTON RA VARED KONID");

        sotonaraye=input.nextInt();




        Integer[][] araye=new Integer[satraraye][sotonaraye];



        Random r=new Random();




        for(int i=0;i<=satraraye-1;i++){
            for(int j=0;j<=sotonaraye-1;j++){


                araye[i][j]=r.nextInt(100);

            }
        }






        for(int i=0;i<satraraye;i++){
            for(int j=0;j<sotonaraye;j++){

                System.out.printf("%d\t",araye[i][j]);
            }
            System.out.printf("\n");
        }





        System.out.println("SHOMARE SATR RA VARED KONID :");


        String kol=input.next();

        String kodam=kol.substring(0,1);

        Integer rx=Integer.parseInt(kol.substring(1));

        //System.out.println("SHOMARE SOTON RA VARED KONID :");
        //cx=input.nextInt();


        if(kodam.compareTo("r")==0) {

            for (int i = 0; i < sotonaraye; i++) {
                for (int j = 0; j < sotonaraye - 1; j++) {

                    if (araye[rx][j] > araye[rx][j + 1]) {

                        int temp = araye[rx][j + 1];
                        araye[rx][j + 1] = araye[rx][j];
                        araye[rx][j] = temp;

                    }
                }
            }


            for (int i = 0; i < satraraye; i++) {
                for (int j = 0; j < sotonaraye; j++) {
                    System.out.printf("%d\t", araye[i][j]);
                }
                System.out.printf("\n");
            }



        }






        if(kodam.compareTo("c")==0){



            for (int i = 0; i < sotonaraye; i++) {
                for (int j = 0; j < sotonaraye - 1; j++) {

                    if (araye[j][rx] > araye[j+1][rx]) {

                        int temp = araye[j+1][rx];
                        araye[j+1][rx] = araye[j][rx];
                        araye[j][rx] = temp;

                    }
                }
            }





            for (int i = 0; i < satraraye; i++) {
                for (int j = 0; j < sotonaraye; j++) {
                    System.out.printf("%d\t", araye[i][j]);
                }
                System.out.printf("\n");
            }





        }















    }
}








