package com.company;

public class Ellipse extends Circle {

    private int r1;

    Ellipse(int x, int y, int r, int r1) {
        super(x, y, r);
        this.r1 = r1;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("r1 = " + this.r1);
    }
}
