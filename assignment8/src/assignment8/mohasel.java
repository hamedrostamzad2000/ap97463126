package assignment8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mohasel {



    public static void m() throws IOException {




        System.out.println("1");





        Scanner input=new Scanner(System.in);






        System.out.println("NAME :");
        String name = input.next();


        System.out.println("FAMILY :");
        String familyname = input.next();


        System.out.println("SHOMARE DANESHGOYI :");
        int number = input.nextInt();


        System.out.println("VAHEDE GOZARANDE SHODE :");
        int vahed = input.nextInt();


        File file1 = new File("D:\\newfile1.dat");
        file1.createNewFile();


        //File file2=new File("D:\\newfile2.dat");
        //file2.createNewFile();


        //Scanner sc=new Scanner(file1);
        PrintWriter pw = new PrintWriter(file1);

        /*while (sc.hasNext()){


            String line = sc.next();

            System.out.println(line);

            pw.println(line);


        }*/


        pw.println(name);

        pw.println(familyname);

        pw.println(number);

        pw.println(vahed);


        //sc.close();
        pw.close();






        //}


    }



}
