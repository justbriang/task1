package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrays = {3,5,4,2,7,8,9,1};
        String inital = "Tempor ip";

        MissingInt missingInt = new MissingInt(arrays);
        System.out.println("Missing digit is");
        System.out.println(missingInt.getDigit());
        ReverseString reverseString = new ReverseString(inital);
        System.out.println("Initial string is :"+inital);
        System.out.println(reverseString.getReversed());

    }

}
