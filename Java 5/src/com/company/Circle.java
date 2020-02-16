package com.company;

public class Circle extends Point {

    private int r;

    Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("r = " + this.r);
    }
}
