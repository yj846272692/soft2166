package chapter09;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/9/18
 */
public class Circle {
    public double getRadius() {
        return radius;
    }

    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double r) {
        radius = r;
    }


    void setRadius(double r) {
        radius = r;
    }

    //面积
    double getArea() {
        return radius * radius * Math.PI;
    }

    //周长
    double getPerimeter() {
        return radius * 2 * Math.PI;
    }

}
