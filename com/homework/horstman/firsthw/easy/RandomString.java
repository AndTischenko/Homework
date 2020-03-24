package com.homework.horstman.firsthw.easy;

import java.util.Random;
/*
Напишите программу, составляющую произвольную символьную строку из
букв и цифр, генерируя произвольное значение типа long
и выводя его по основанию 36.
 */
public class RandomString {
        public static void main(String[] args) {
                Random random = new Random();
                long var = random.nextLong();
                System.out.println(var);
                System.out.println(Long.toString(var,36));
        }
}
