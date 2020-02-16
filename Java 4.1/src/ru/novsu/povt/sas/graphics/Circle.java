package ru.novsu.povt.sas.graphics;

public class Circle extends Point {

    private int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("r = " + this.r);
    }
}
