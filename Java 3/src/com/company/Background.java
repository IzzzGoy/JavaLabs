package com.company;

public class Background extends Graph {
    String texture;
    String color;

    Background(String texture, String color) {
        this.texture = texture;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("texture = " + this.texture + " color = " + this.color);
    }
}
