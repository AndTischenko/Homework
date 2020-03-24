package com.homework.horstman.firsthw.medium;

import java.util.Scanner;
/*Напишите программу, вводящую два числа в пределах от 0 до 65535,
 сохраняющую их в переменных типа short и вычисляющую их сумму,
 разность, произведение, частное и остаток без знака,
 не преобразуя эти величины в тип int. */
public class UnsignedShort {
    public static void main(String[] args) {
        System.out.print("Insert number [0,65535]:");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        first= first - 32768;
        second= second - 32768;
        short firstShort = (short) first;
        System.out.println(firstShort);
        short secondShort = (short) second;
        System.out.println(secondShort);
        System.out.println((firstShort+32768)+(secondShort+32768));
        System.out.println((firstShort+32768)-(secondShort+32768));
        System.out.println((firstShort+32768)/(secondShort+32768));
        System.out.println((firstShort+32768)*(secondShort+32768));
        System.out.println((firstShort+32768)%(secondShort+32768));
        //Нужно было внимательней читать)
    }
}
