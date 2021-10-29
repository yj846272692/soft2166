package comparable;

public class CompareTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle("circle1", 5);
        Circle circle2 = new Circle("circle2", 8);
        Circle circle = (Circle) CeometricObject.Max(circle1, circle2);
        System.out.println("The max circle is " + circle.getName());
        System.out.println("The max circle's Area is " + circle.getArea());

        Rectangle rectangle1 = new Rectangle("rectangle1", 15, 10);
        Rectangle rectangle2 = new Rectangle("rectangle2", 10, 5);
        Rectangle rectangle3 = (Rectangle) CeometricObject.Max(rectangle1, rectangle2);
        System.out.println("The max rectangle is " + rectangle3.getName());
        System.out.println("The max rectangle areas is " + rectangle3.getArea());

    }
}
