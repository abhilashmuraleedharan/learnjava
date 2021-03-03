package com.learnjava;

public class Main {

    public static void main(String[] args) {
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("minFloatValue = " + minFloatValue);
        System.out.println("maxFloatValue = " + maxFloatValue);
        
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("minDoubleValue = " + minDoubleValue);
        System.out.println("maxDoubleValue = " + maxDoubleValue);

        int myIntNum = 22/7;
        float myFloatNum = 22f/7;
        double myDoubleNum = 22d/7;
        System.out.println("int num = " + myIntNum);
        System.out.println("float num = " + myFloatNum);
        System.out.println("double num = " + myDoubleNum);

        double weightInPounds = 8.5d;
        double weightInKilograms = weightInPounds * 0.45359237;
        System.out.println(weightInPounds + " pounds = " + weightInKilograms + " kilograms");
    }
}
