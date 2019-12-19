import java.text.DecimalFormat;

public class StringOutput {
        /*
         * "-Xmx1G -Xms256M -Darg1=arg1override"
         * Output: min-memory: 256.00, max-memory: 1000.00
         */

        public static void main(String[] args) {
            String input = "-Xmx1G -Xms256M -Darg1=arg1override";
            String output = "Output: \nmin-memory: 256.00, max-memory: 1000.00";
            //System.out.println(input +"\n"+output);

            String[] arrOfStr = input.split(" ");
            for(String a : arrOfStr){
                if(a.contains("Xms")){
                    String xms=
                            a.substring(
                                    (
                                            a.lastIndexOf("Xms") + 3
                                    ),
                                    a.lastIndexOf("M")
                            );
                    System.out.print ("min-memory: " +
                            String.format("%.02f",
                                    Float.parseFloat(xms)
                            )
                            + ", "
                    );
                }
            }

            for(String a : arrOfStr){
                if(a.contains("Xmx")){
                    String xmx=
                            a.substring(
                                    (
                                            a.lastIndexOf("Xmx") + 3
                                    ),
                                    a.lastIndexOf("G")
                            );
                    System.out.println("max-memory: " +
                        String.format("%.02f",
                                    Float.parseFloat(xmx) * 1000
                        )
                    );
                }
            }
        }
    }

