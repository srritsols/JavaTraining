public class StringDatatypes {
     //-Xmx1G -Xms256M -Darg1=arg1override

    public static void main(String[] args) {
        String input = "-Xmx2G -Xms1G -Darg1=arg1override";


        String[] arrOfStr = input.split(" ");

        for(String a : arrOfStr) {
            if (a.contains("Xms") && a.contains("M")) {
                String xms = a.substring((a.lastIndexOf("Xms") + 3), a.lastIndexOf("M"));
                System.out.print("min-memory: " +
                        String.format("%.02f", Float.parseFloat(xms)) + " MB" + "\n");
            } else if (a.contains("Xms") && a.contains("G")){
                String xms = a.substring((a.lastIndexOf("Xms") + 3), a.lastIndexOf("G"));
                System.out.print("min-memory: " +
                        String.format("%.02f", Float.parseFloat(xms) * 1000) + " MB" + "\n");
            }
        }

        for(String a : arrOfStr){
            if (a.contains("Xmx") && a.contains("G")){
                String xmx = a.substring((a.lastIndexOf("Xmx") + 3), a.lastIndexOf("G"));
                System.out.println("max-memory: " +
                        String.format("%.02f", Float.parseFloat(xmx) * 1000) + " MB");
            } else if (a.contains("Xmx") && a.contains("M")){
                String xmx = a.substring((a.lastIndexOf("Xmx") + 3), a.lastIndexOf("M"));
                System.out.println("max-memory: " +
                        String.format("%.02f", Float.parseFloat(xmx)) + " MB");
            }
        }
    }
}
