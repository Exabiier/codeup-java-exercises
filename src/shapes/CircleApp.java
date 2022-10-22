package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle:");
        Input x = new Input();
        double rad = x.scanner.nextDouble();
        Circle c = new Circle(rad);
        System.out.println("The area of Circle is:");
        System.out.println(c.getArea());
        System.out.println("This Circumference:");
        System.out.println(c.getCircumference());
    }
}
