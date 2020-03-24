package com.homework.horstman.firsthw.easy;

import java.util.Scanner;

/*Напишите программу, вводящую целочисленное значение и выводящую его
в двоичной, восьмеричной и шестнадцатеричной форме. Организуйте вывод
обратного значения в виде шестнадцатеричного числа с плавающей точкой.*/

public class Printf {
    public static void main(String[] args) {
        System.out.print("Insert number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));
    }
}