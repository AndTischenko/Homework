package com.homework.horstman.firsthw.medium;

import java.math.BigInteger;
/*Напишите программу, вычисляющую факториал п ! = 1 х 2 * . . . х п,
используя класс Biglnteger. Вычислите факториал числа 1000.*/

public class Factorial {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 2; i <= 1000; i++){
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
}
