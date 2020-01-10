package classes.practive.tanveer;

public class PrimativeDatatypesByte {
    public static void main(String[] args) {
        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;
        System.out.println("minByteVal: "+minByteVal);
        System.out.println("maxByteVal: "+maxByteVal);

        byte minByteValByTwo = (byte) (minByteVal/2);
        System.out.println("minByteValByTwo: "+minByteValByTwo);
    }
}
