package assignment5;


import java.sql.Time;

public class Assignment5 {




    public static void main(String args[]){


        Integer x;
        Integer y;



        Double bozorgtarin=0.0;
        Double kochektarin=0.0;



        Long start=System.currentTimeMillis();


        for(x=-1000;x<=1000;x++) {

            for(y=-1000;y<1000;y++) {


                Double x1 = Math.pow(x, 2);


                Double y1 = Math.pow(y, 2);


                Double sorat = Math.sqrt(x1 + y1);


                Double makhraj = x * Math.sin(x + y) + y * Math.cos(x + y);


                Double hasel = sorat / makhraj;


                if(hasel>bozorgtarin){
                    bozorgtarin=hasel;

                }


                if(hasel<kochektarin){
                    kochektarin=hasel;

                }




            }

        }





        System.out.println(bozorgtarin);
        System.out.println(kochektarin);


        System.out.println(System.currentTimeMillis()-start+"ms");



    }


}
