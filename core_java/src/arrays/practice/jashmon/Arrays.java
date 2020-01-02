public class Arrays {

    public static void main(String[] args){

        //Average an array of values.

        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;

        for( i = 0; i < 5; i++)
            result = result + nums[i];
        System.out.println("Average: " + result / 5);

        // Two-Dimensional Array.

        int twoD[][] = new int[4][5];
        int j, k = 0;

        for (i = 0; i < 4; i++)
            for(j = 0; j < 5; j++){
                twoD[i][j] = k;
                k++;
            }
        for(i = 0; i < 4; i++){
            for(j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
