package com.homework.horstman.secondhw.car;
/*
Реализуйте класс Саг, моделирующий передвижение автомобиля на бензиновом топливе по оси х.
Предоставьте методы для передвижения автомобиля на
заданное количество километров, заполнения топливного бака заданным количеством литров бензина,
вычисления расстояния, пройденного от начала
координат, а также уровня топлива в баке. Укажите расход топлива (в км/л)
в качестве параметра конструктора данного класса. Должен ли этот класс быть
неизменяемым и почему?
 */
public class Car {
    private double x=0.0d;
    private double fuel = 0.0d;
    private double fuelFlow;

    public Car(double fuelFlow){
        this.fuelFlow = fuelFlow;
    }

    public double getX() {
        return x;
    }

    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Проехал:" + x +
                ", Уровень топлива:" + fuel +
                ", Расход топлива:" + fuelFlow +
                '}';
    }

    public void move(int dX){
        this.x = x + dX;
        this.fuel = fuel - x/fuelFlow;
    }
    public void moveWhileNotEmpty(){    //решил немного дополнить, а то слишком просто)
        this.x = x + fuel*fuelFlow;
        this.fuel = 0;
    }
    public void fillFuel(double newFuel){
        this.fuel = fuel+newFuel;
    }

}
