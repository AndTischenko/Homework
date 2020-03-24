package com.homework.horstman.firsthw.easy;
/*Что произойдет, если привести числовое значение типа double к значению
типа int, которое больше самого большого значения типа int? Попробуйте
сделать это.*/
public class FromDoubleToInt {
    public static void main(String[] args) {
        double billion = 3.E+9;
        System.out.println(billion);
        int x = (int) billion;
        System.out.println(x);
    }
}
