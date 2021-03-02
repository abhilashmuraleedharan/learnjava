package com.learnjava;

public class Main {

    public static void main(String[] args) {
        int minIntegerValue = Integer.MIN_VALUE;
        int maxIntegerValue = Integer.MAX_VALUE;
        System.out.println("minIntegerValue = " + minIntegerValue);
        System.out.println("maxIntegerValue = " + maxIntegerValue);
        System.out.println("Busted Max Value = " + (maxIntegerValue + 1)); // Overflow example
        System.out.println("Busted Min Value = " + (minIntegerValue - 1)); // Underflow example

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("minByteValue = " + minByteValue);
        System.out.println("maxByteValue = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("minShortValue = " + minShortValue);
        System.out.println("maxShortValue = " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("minLongValue = " + minLongValue);
        System.out.println("maxLongValue = " + maxLongValue);
    }
}
