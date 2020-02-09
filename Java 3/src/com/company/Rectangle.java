package com.company;

public class Rectangle extends Point {

    private int h;
    private int w;

    Rectangle(int x, int y, int h, int w) {
        super(x, y);
        this.h = h;
        this.w = w;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("h = " + this.h + "\nw = " + this.w);
    }
}
