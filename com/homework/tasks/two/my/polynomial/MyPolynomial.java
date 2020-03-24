package com.homework.tasks.two.my.polynomial;

import java.util.Arrays;

public class MyPolynomial {
    private double coeffs[];

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree(){
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = coeffs.length-1,j=0;i>=0;i--,j++) {
            if(j==coeffs.length-1){                      //костыль(исправить позже)
                str += coeffs[j] + "x^" + i;
                break;
            }
            str += coeffs[j] + "x^" + i + " + ";
        }
        return str;
    }
    public double evaluate(double x){
        double sum=0;
        for(int i=coeffs.length-1, j = 0;i>=0;i--,j++){
            sum += coeffs[j]*Math.pow(x,i);
        }
        return sum;
    }
    public MyPolynomial add(MyPolynomial right){                //работает только с массивами равной длины
        double[] current = new double[this.coeffs.length];      //исправить позже
        for(int i=0;i<this.coeffs.length;i++){
            current[i]=right.coeffs[i]+this.coeffs[i];
        }
        MyPolynomial left = new MyPolynomial(current);
        return left;
    }
    public MyPolynomial multiple(MyPolynomial right){
        double[] current = new double[this.coeffs.length];
        for(int i=0;i<this.coeffs.length;i++){
            current[i]=right.coeffs[i]*this.coeffs[i];
        }
        MyPolynomial left = new MyPolynomial(current);
        return left;
    }
}
