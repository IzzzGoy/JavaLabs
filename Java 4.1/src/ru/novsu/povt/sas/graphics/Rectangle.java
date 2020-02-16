package ru.novsu.povt.sas.graphics;

public class Rectangle extends Point {

    private int h;
    private int w;

    public Rectangle(int x, int y, int h, int w) {
        super(x, y);
        this.h = h;
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("h = " + this.h + "\nw = " + this.w);
    }
}
