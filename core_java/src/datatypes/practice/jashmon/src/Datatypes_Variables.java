import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Datatypes_Variables {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args){

        //compute the area of the circle

        double pi, radius, area;

        radius = 10.8;
        pi = 3.14;
        area = pi * radius * radius ;

        System.out.println("Area of circle is: " + df2.format(area));

        //------------------------------------------------

        // Demonstrate casts.s

        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion of int to byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);

        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
