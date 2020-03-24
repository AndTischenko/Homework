package com.homework.tasks.one.mytriangle;

import com.homework.tasks.one.mypoint.MyPoint;

public class MyTriangle {
    private MyPoint v1=new MyPoint();
    private MyPoint v2=new MyPoint();
    private MyPoint v3=new MyPoint();

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1.setX(x1);
        this.v2.setX(x2);
        this.v3.setX(x3);
        this.v1.setY(y1);
        this.v2.setY(y2);
        this.v3.setY(y3);
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                '}';
    }
    public double getPerimeter(){
        double a = v1.distanceToAnotherPoint(v2);
        double b = v2.distanceToAnotherPoint(v3);
        double c = v3.distanceToAnotherPoint(v1);
        return a+b+c;
    }
    public String getType(){
        double a = v1.distanceToAnotherPoint(v2);
        double b = v2.distanceToAnotherPoint(v3);
        double c = v3.distanceToAnotherPoint(v1);
        if( equalDouble(a,b) && !(equalDouble(a,c)) || equalDouble(a,c) && !(equalDouble(a,b)) || equalDouble(b,c) && !(equalDouble(a,b))){
            return "Isosceles";
        }
        if(equalDouble(a,b)&&equalDouble(a,c)) {
            return "Equilateral";
        }
        return "Versatile";
    }
    public boolean equalDouble(double a, double b){
        return Math.abs(a-b)<=Math.pow(10,-6);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
