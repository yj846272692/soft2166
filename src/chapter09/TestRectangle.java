package chapter09;

/**
 * @author YG.
 * @description: 矩形测试类
 * @DATE: 2021/9/18
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        //矩形1
        System.out.println("矩形1的高度为：" + r1.getHeight());
        System.out.println("矩形1的宽度为：" + r1.getWidth());
        System.out.println("矩形1的面积为：" + r1.getArea());
        System.out.println("矩形1的周长为：" + r1.getPerimeter());

        //矩形2
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("矩形2的高度为：" + r2.getHeight());
        System.out.println("矩形2的宽度为：" + r2.getWidth());
        System.out.println("矩形2的面积为：" + r2.getArea());
        System.out.println("矩形2的周长为：" + r2.getPerimeter());

        //默认值
        Rectangle r = new Rectangle();
        System.out.println(r);
    }
}
