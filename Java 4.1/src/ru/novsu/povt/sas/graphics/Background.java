package ru.novsu.povt.sas.graphics;

import ru.novsu.povt.sas.graphics.res.Color;
import ru.novsu.povt.sas.graphics.res.Texture;

public class Background extends Graph {
    private Texture texture;
    private Color color;

    public Background(Texture texture, Color color) {
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
        System.out.println("texture = " + getTextureName() + " color = " + getColorName());
    }
}
