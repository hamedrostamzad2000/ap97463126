package assignment3;


import java.util.Random;
import java.util.Scanner;

public class Assignment3 {




    public static void main(String[] args) {

        Integer adad;


        System.out.println("ADADE KHOD RA VARED KONID :");

        Scanner input=new Scanner(System.in);
        adad=input.nextInt();

        Integer[][] araye=new Integer[adad][adad];




        for(int i=0;i<adad;i++){
            for(int j=0;j<adad;j++){

                Random r=new Random();
                araye[i][j]=r.nextInt(10);

            }
        }

        for(int i=0;i<adad;i++) {
            for (int j = 0; j < adad; j++) {

                System.out.println(araye[i][j]);


            }

        }

    }

}
