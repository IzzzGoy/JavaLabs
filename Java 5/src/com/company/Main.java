package com.company;

public class Main {

    public static void main(String[] args) {
	IMovable[] mass = new IMovable[4];
	mass[0] = new Circle(10, 20 ,5);
	mass[1] = new Rectangle(10,2,2,5);
	//mass[2] = new Point(3,4);
	mass[3] = new Ellipse(4,5,6,7);

        for (IMovable obj: mass) {
            try {
                swapXY(obj);
            }catch (NullPointerException ex) {
                System.out.println ("Error while swapping coordinates.");
                ex.printStackTrace();
            }
        }
    }

    static void swapXY(IMovable obj) {
        if (obj == null) {
            throw new NullPointerException("Object is null!");
        }
        System.out.println("old values x = "  + obj.getX() + " y = " + obj.getY());
        int distance = obj.getX() - obj.getY();
        obj.moveTo(-distance, distance);
        System.out.println("new values x = " + obj.getX() + " y = " + obj.getY());
    }
}
