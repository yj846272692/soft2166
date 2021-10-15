package chapter09;

/**
 * @author YG.
 * @description: 矩形类
 * @DATE: 2021/9/18
 */
public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //无参构造方法
    Rectangle() {
        width = 1;
        height = 1;
    }

    //计算面积
    double getArea() {
        return width * height;
    }

    //计算周长
    double getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
