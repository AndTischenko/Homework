package com.homework.horstman.secondhw.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(10.0);
        car.fillFuel(64);
        System.out.println(car);
        car.move(115);
        System.out.println(car);
        car.moveWhileNotEmpty();
        System.out.println(car);
    }
}
