package classes.practive.tanveer;

public class PrimativeDatatypesInt {
    public static void main(String[] args) {
        int val = 1000;
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;

        System.out.println("Integer minVal: "+ minVal);
        System.out.println("Integer maxVal: "+ maxVal);
        System.out.println("Integer minVal-1: "+ (minVal-1));
        System.out.println("Integer maxVal+1: "+ (maxVal+1));

        int totalValByTwo = (minVal/2);
        System.out.println("Integer (minVal/2): "+ totalValByTwo);
    }
}
