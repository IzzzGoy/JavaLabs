package com.company;

import com.company.res.Color;
import com.company.res.Texture;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10, 20, 5);
        Rectangle rectangle = new Rectangle(5,3,6,8);
        Background background = new Background(new Texture("Flash"), new Color("Red"));

        circle.draw();
        rectangle.draw();
        background.draw();
	// write your code here
    }
}
