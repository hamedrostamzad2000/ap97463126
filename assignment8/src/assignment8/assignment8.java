package assignment8;

import java.io.IOException;
import java.util.Scanner;

public class assignment8 {


    public static void main(String args[]) throws IOException {



        Scanner input=new Scanner(System.in);





        System.out.println("1 or 2");

        int c=input.nextInt();

        if(c==2){
            fareghtahsil j=new fareghtahsil();
            j.g();
        }
        if(c==1) {
            mohasel s = new mohasel();
            s.m();
        }

    }



}
