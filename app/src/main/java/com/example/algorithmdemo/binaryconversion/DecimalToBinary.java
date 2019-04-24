package com.example.algorithmdemo.binaryconversion;

/**
 * Created by kangbaibai on 2019/4/4.
 * 十进制转二进制
 */

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(10));
    }

    public static String toBinary(int num) {
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            str.insert(0, num % 2);
            num = num / 2;
        }
        return str.toString();
    }
}
