package com.company;

import com.company.res.*;

public class Background extends Graph {
    private Texture texture;
    private Color color;

    Background(Texture texture, Color color) {
        this.texture = texture;
        this.color = color;
    }

    public String getColorName() {
        return color.getName();
    }

    public String getTextureName() {
        return texture.getName();
    }

    @Override
    public void draw() {
        System.out.println("texture = " + this.texture + " color = " + this.color);
    }
}
