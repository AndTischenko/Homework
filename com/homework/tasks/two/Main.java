package com.homework.tasks.two;

import com.homework.tasks.two.ball.Container;
import com.homework.tasks.two.my.complex.MyComplex;
import com.homework.tasks.two.my.polynomial.MyPolynomial;
import com.homework.tasks.two.ball.Ball;

public class Main {
    public static void main(String[] args) {
        MyComplex complex = new MyComplex(3.0,4.0);
        MyComplex complex1 = new MyComplex(5,9);
        System.out.println(complex.equals(complex1));
        System.out.println(complex.magnitude());
        System.out.println(complex.argument());
        System.out.println(complex.conjugate());
        System.out.println(complex.subtractNew(complex1));
        System.out.println("_______________________");

        MyPolynomial polynomial = new MyPolynomial(2,4,5,6);
        MyPolynomial polynomial1 = new MyPolynomial(1,2,3,4);
        System.out.println(polynomial);
        System.out.println(polynomial.getDegree());
        System.out.println(polynomial.evaluate(1));
        System.out.println(polynomial.add(polynomial1));
        System.out.println(polynomial.multiple(polynomial1));
        System.out.println("_______________________");

        Ball ball = new Ball(5,5,1,1,0);
        System.out.println(ball);
        Container container = new Container(0 ,0,10,10);
        System.out.println(container);
        while(container.collides(ball)==true) {
            ball.move();
            System.out.println(ball);
            System.out.println(container.collides(ball));
        }
        System.out.println("_______________________");



    }
    }