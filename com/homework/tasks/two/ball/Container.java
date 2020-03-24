package com.homework.tasks.two.ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1+width;
        this.y2 = y1+height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidth() {
        return Math.abs(x2-x1);
    }

    public int getHeight() {
        return Math.abs(y2-y1);
    }

    public boolean collides(Ball ball){
        if( (ball.getX()+ball.getRadius()<getWidth()) && (ball.getY()+ball.getRadius()<getHeight()) ){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[" +
                "(" + x1 +
                "," + y1 +
                ",),(" + x2 +
                "," + y2 +
                ")]";
    }
}
