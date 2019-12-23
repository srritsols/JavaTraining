package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        String cars1[] = {"Honda", "Lexus", "Ferrari", "Hyundai"};
        String cars2[] = {"BMW", "Tesla", "Camry", "Ferrari"};

        System.out.println("cars1: "+ Arrays.toString(cars1));
        System.out.println("cars2: "+ Arrays.toString(cars2));

        Set<String> hs = new HashSet<>();

        for (String car1:cars1){
            for(String car2:cars2){
                if(car1.equals(car2)){
                    hs.add(car1);
                }
            }
        }
        System.out.println("CommonElements: "+ hs);
    }
}
