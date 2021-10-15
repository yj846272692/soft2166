package chapter09;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/9/18
 */
public class MyPoint {
    double x;
    double y;

    //创建点（0，0）的无参构造方法
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    //特定坐标点的构造方法
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //两个MyPoint对象之间的距离
    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(p1.getX() - p2.getX() * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
    }

    //该点到MyPoint类型的指定点之间的距离
    public double distance(MyPoint p) {
        return distance(this, p);
    }

    //从该点到指定x和y坐标的指定点之间的距离
    public double distance(double x, double y) {
        MyPoint m = new MyPoint();
        m.setX(x);
        m.setY(y);
        return distance(this, m);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
