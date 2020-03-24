package com.homework.horstman.firsthw.good;

import java.util.Scanner;

/*Напишите программу, вводящую три целочисленных значения и выводящую
самое большое из них, используя только условную операцию. Сделайте то же
самое с помощью метода M a t h .ш ах ().*/

public class Maximum {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Insert first number:");
    int x = in.nextInt();
    System.out.print("Insert second number:");
    int y = in.nextInt();
    System.out.print("Insert third number:");
    int z = in.nextInt();
    System.out.println(Math.max(x,Math.max(y,z)));
    if(x>y){
        if(x>z){
            System.out.println(x);
        } else if(z>y){
            System.out.println(z);
        }
        else{
            System.out.println(y);
        }
    } else if (y > z) {
        System.out.println(y);
    } else{
        System.out.println(z);
    }
    }
}
