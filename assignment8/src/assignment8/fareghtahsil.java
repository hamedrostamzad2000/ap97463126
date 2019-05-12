package assignment8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fareghtahsil {




    public static void g() throws IOException {



        System.out.println("2");




        Scanner input=new Scanner(System.in);



        System.out.println("NAME :");
        String name=input.next();



        System.out.println("FAMILY :");
        String familyname=input.next();




        System.out.println("SHOMARE DANESHGOYI :");
        int number=input.nextInt();


        System.out.println("SALE FAREGHO TAHSILY :");
        int salferaghat=input.nextInt();






        File file2 = new File("D:\\newfile2.dat");
        file2.createNewFile();




        PrintWriter pw=new PrintWriter(file2);




        pw.println(name);

        pw.println(familyname);

        pw.println(number);

        pw.println(salferaghat);



        pw.close();






















    }





}
