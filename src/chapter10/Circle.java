package chapter10;

/**
 * @description: 子类-圆
 * @author: YG.
 * @create: 2021-10-06
 **/
public class Circle extends Geometry{
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled,int radius) {
        super(color, filled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
