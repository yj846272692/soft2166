package totalArea;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/8
 */
public class Circle extends Geometry {
    double r;

    Circle(double r) {

        this.r = r;

    }

    //【代码2】重写 getArea()方法

    @Override
    public double getArea() {
        return r * r * Math.PI;
    }
}
