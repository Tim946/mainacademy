package ua.mainacademy;

import ua.mainacademy.model.Circle;
import ua.mainacademy.model.Shape;
import ua.mainacademy.model.Rectangle;
import ua.mainacademy.model.Square;

public class FirstApplication {
    public static double radius =3.14;
    public static void main(String[] args) {
        Circle firstCircle = new Circle();
        firstCircle.setRadius(10);
        Circle secondCircle = new Circle();
        secondCircle.setRadius(10);
        Circle lastCircle = new Circle();
        lastCircle.setRadius(10);
//        System.out.println("Circle area with radius " + firstCircle.radius + " is " + firstCircle.getArea());
//        System.out.println("Circle area with radius " + secondCircle.radius + " is " + secondCircle.getArea());
//        System.out.println("Circle area with radius " + lastCircle.radius + " is " + lastCircle.getArea());

        Rectangle rectangle= new Rectangle();
        rectangle.setSideA(10);
        rectangle.setSideB(15);
        System.out.println("Rectangle area is " + rectangle.getArea());

        Shape shape = new Square();


    }
}
