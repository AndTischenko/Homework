package com.homework.horstman.secondhw.point;
/*
Реализуйте неизменяемый класс P o in t , описывающий точку на плоскости.
Предоставьте его конструктор, чтобы задать конкретную точку; конструктор
без аргументов, чтобы задать точку в начале координат; а также методы g e t X (),
g e tY (), t r a n s l a t e ( ) и s c a l e ( ) .

В частности, метод t r a n s l a t e ()
 должен перемещать точку на определенное расстояние
в направлении координат х и у, а

метод s c a le () — изменять масштаб по обеим координатам на заданный коэффициент.
Реализуйте эти методы таким образом, чтобы они возвращали новые
точки в качестве результата. Например, в следующей строке кода:
Point р = new Point(3, 4).translate(1, 3).scale(0.5);
в переменной р должна быть установлена точка с координатами (2, 3,5).
 */
public class Point {
    private double x=0.0d;
    private double y=0.0d;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public Point translate(double dX,double dY){
        Point p = new Point(this.x+dX,this.y+dY);
        return p;
    }
    public Point scale(double coefficient){
        Point p = new Point(this.x*coefficient,this.y*coefficient);
        return p;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
