package com.homework.horstman.secondhw.point;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        Point p1 = new Point(1,1);
        System.out.println(p1.scale(0.5));
        System.out.println(p1.scale(2).translate(2,3));
    }
}
