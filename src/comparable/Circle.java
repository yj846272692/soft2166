package comparable;

public class Circle extends CeometricObject {

    private double radius = 0;
    private String name;

    public Circle() {

    }

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public double getArea() {
        double a = Math.pow(radius, 2);
        return Math.PI * a;
    }

    public int compareTo(CeometricObject o) {
        if (getArea() > ((Circle) o).getArea()) {
            return 1;
        } else if (getArea() < ((Circle) o).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
