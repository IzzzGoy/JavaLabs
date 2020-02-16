package com.company;

import ru.novsu.povt.sas.graphics.Background;
import ru.novsu.povt.sas.graphics.Circle;
import ru.novsu.povt.sas.graphics.Rectangle;
import ru.novsu.povt.sas.graphics.res.Color;
import ru.novsu.povt.sas.graphics.res.Texture;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10, 20, 5);
        Rectangle rectangle = new Rectangle(5,3,6,8);
        Background background = new Background(new Texture("Flash"), new Color("Red"));

        circle.draw();
        rectangle.draw();
        background.draw();
        rectangle.move(7,5);
        rectangle.draw();
        rectangle.moveTo(1,3);
        rectangle.draw();
    }
}
