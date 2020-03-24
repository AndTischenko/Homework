package com.homework.tasks.two.my.complex;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real,double imag){
        this.imag = imag;
        this.real = real;
    }

    @Override
    public String toString() {
        return "( " +
                 + real +
                " + " + imag +
                "i)";
    }
    public boolean isReal(){
        if(real==0) {
            return false;
        }
        return true;
    }
    public boolean isImag(){
        if(imag==0) {
            return false;
        }
        return true;
    }

    public boolean equals(double real,double imag){
        if((this.real==real)&&(this.imag==imag)){
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex complex){
        if((this.real==complex.getReal())&&(this.imag==complex.getImag())){
            return true;
        }
        return false;
    }
    public double magnitude(){
        return Math.sqrt((Math.pow(real,2))+(Math.pow(real,2)));
    }
    public double argument(){
        if((real<0)&&(imag>0)){
            return Math.PI+Math.atan((imag/real));
        }
        if((real<0)&&(imag<0)){
            return Math.atan((imag/real))-Math.PI;
        }
        return Math.atan((imag/real));
    }
    public MyComplex add(MyComplex right){
        double a = this.real + right.getReal();
        double b = this.imag + right.getImag();
        right.setValue(a,b);
        return  right;
    }
    public MyComplex subtract(MyComplex right){
        double a = this.real - right.getReal();
        double b = this.imag - right.getImag();
        right.setValue(a,b);
        return  right;
    }
    public MyComplex addNew(MyComplex right){
        double a = this.real + right.getReal();
        double b = this.imag + right.getImag();
        MyComplex left = new MyComplex(a,b);
        return left;
    }
    public MyComplex subtractNew(MyComplex right){
        double a = this.real - right.getReal();
        double b = this.imag - right.getImag();
        MyComplex left = new MyComplex(a,b);
        return left;
    }
    public MyComplex multiply(MyComplex right){
        double a = this.real * right.getReal();
        double b = this.imag * right.getImag();
        right.setValue(a,b);
        return  right;
    }
    public MyComplex divide(MyComplex right){
        double a = this.real / right.getReal();
        double b = this.imag / right.getImag();
        right.setValue(a,b);
        return  right;
    }
    public MyComplex conjugate(){
        double a = this.real;
        double b = 0- this.imag;
        MyComplex inter = new MyComplex(a,b);
        return inter;
    }
}
