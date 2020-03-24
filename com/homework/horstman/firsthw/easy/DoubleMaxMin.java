package com.homework.horstman.firsthw.easy;


/*Напишите программу, выводящую наименьшее и наибольшее положительные значения типа double. Подсказка: воспользуйтесь методом Math.nextUp ()
из прикладного программного интерфейса Java API.*/

public class DoubleMaxMin {
    public static void main(String[] args) {
        System.out.println(Double.MAX_VALUE);
        System.out.println(Math.nextUp(0.0));
    }
}
