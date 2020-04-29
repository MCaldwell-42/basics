package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value =" + myMinIntValue);
        System.out.println("Integer maximum value =" + myMaxIntValue);

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =" + myMinShortValue);
        System.out.println("Short Maximum Value =" + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value =" + myMinLongValue);
        System.out.println("Long Maximum Value =" + myMaxLongValue);
        long bigLongLiteralValue = 2147483647284L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue /2);
        long myNewLongValue = (myMinLongValue / 2);

        byte chalByte = 23;
        short chalShort = 287;
        int chalInt = 24356;
        long chalLong = 50000L +(10L *(chalByte+chalShort+chalInt));
        System.out.println(chalLong);

    }
}
