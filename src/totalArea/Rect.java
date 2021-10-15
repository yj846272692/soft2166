package totalArea;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/8
 */
public class Rect extends Geometry {
    double a, b;

    Rect(double a, double b) {

        this.a = a;

        this.b = b;

    }

    //【代码1】重写 getArea()方法
    @Override
    public double getArea() {
        return a * b;
    }
}
