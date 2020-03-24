package com.homework.horstman.firsthw.easy;

import java.util.Scanner;

/*Напишите программу, вводящую целочисленное (как положительное, так и
отрицательное) значение угла и нормализующую его в пределах от 0 до 359
градусов. Попробуйте сделать это сначала с помощью операции %, а затем метода f lo o r M o d ( ).*/

public class FloorMod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert number:");
        int x = in.nextInt();
        System.out.println((x%360+360)%360);
        System.out.println(Math.floorMod(x,360));
    }
}
