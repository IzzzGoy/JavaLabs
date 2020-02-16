package com.company;

public class Point extends Graph implements IMovable{
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("\nx = " + this.x + "\ny = " + this.y);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x += x;
        this.y += y;
    }

    /*public void moveTo(int dx, int dy){
        x += dx;
        y += dy;
    }*/
}
