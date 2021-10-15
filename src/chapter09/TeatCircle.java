package chapter09;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/9/18
 */
public class TeatCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("圆的直径是：" + c1.radius);
        System.out.println("圆的面积是：" + c1.getArea());
        System.out.println("圆的周长是：" + c1.getPerimeter());

        Circle c2 = new Circle(10);
        System.out.println("圆的直径是：" + c2.radius);
        System.out.println("圆的面积是：" + c2.getArea());
        System.out.println("圆的周长是：" + c2.getPerimeter());

        c1.setRadius(3);
        System.out.println("圆的直径是：" + c1.radius);
        System.out.println("圆的面积是：" + c1.getArea());
        System.out.println("圆的周长是：" + c1.getPerimeter());
    }
}
