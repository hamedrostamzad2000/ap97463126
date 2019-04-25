package assignment6;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class assignment6 {



    public static void main(String args[]){




        int sum=0;






        System.out.println("ADADE KHOD RA VARED KONID :");

        Scanner input=new Scanner(System.in);


        int x=input.nextInt();



        Random R=new Random();


        int tedadsatr=R.nextInt(x);




        ArrayList araye1=new ArrayList(tedadsatr);




        int andazesatr;


        for(int i=0;i<=tedadsatr;i++){

            andazesatr=R.nextInt(x);
            ArrayList<Integer> araye2=new ArrayList(andazesatr);


            for(int j=0;j<andazesatr;j++){


                int adadetasadofi=R.nextInt(x);
                araye2.add(adadetasadofi);




            }



            System.out.println(araye2);


            for(int l=0;l<araye2.size();l++){


                sum=araye2.get(l)+sum;


            }





        }





















    }
}
