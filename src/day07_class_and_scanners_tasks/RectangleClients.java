package day07_class_and_scanners_tasks;

import org.w3c.dom.css.Rect;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 5.2;
        rectangle1.width = 3;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 2.1;
        rectangle2.width = 4;

        System.out.println("Rectangle 1 results : \n" + rectangle1);
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println("Rectangle 2 results : \n" + rectangle2);
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
    }

}
