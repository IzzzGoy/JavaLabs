package com.company;

public class Point extends Graph{
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

    public void moveTo(int dx, int dy){
        x += dx;
        y += dy;
    }
}
