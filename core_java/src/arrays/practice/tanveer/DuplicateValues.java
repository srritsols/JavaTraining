package com.arrays;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

public class DuplicateValues {
    public static void main(String[] args) {

        int numArr[]={10, 83, 20, 40, 15, 44, 40, 83, 70};
        Set<Integer> hs = new TreeSet<>();
        System.out.println("numArr: "+ Arrays.toString(numArr));
        System.out.println("Duplicates: "+hs.toString());

        for (int i=0; i<numArr.length-1; i++){
            for(int j=0; j<numArr.length-1; j++){
                if(numArr[i]==numArr[j] && i!=j){
                    hs.add(numArr[j]);
                }
            }
        }
        System.out.println("Duplicates: "+hs.toString());
    }
}
