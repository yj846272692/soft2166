package comparable;

public class Rectangle extends CeometricObject {
    private double length;
    private double width;
    private String name;

    public Rectangle() {
    }

    public Rectangle(String name, double length, double width) {
        super();
        this.length = length;
        this.width = width;
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return width;
    }

    public void setWeight(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public double getArea() {
        return width * length;
    }

    public int compareTo(CeometricObject o) {
        if (getArea() > ((Rectangle) o).getArea()) {
            return 1;
        } else if (getArea() < ((Rectangle) o).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
