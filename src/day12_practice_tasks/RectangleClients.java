package day12_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(-20);
        rectangle1.setLength(30);
        System.out.println("rectangle1 width= " + rectangle1.getWidth());
        System.out.println("rectangle1 length= " + rectangle1.getLength());
        System.out.println("rectangle1 area= " + rectangle1.calcArea());
        System.out.println("rectangle1 perimeter= " + rectangle1.calcPerimeter());

    }
}
