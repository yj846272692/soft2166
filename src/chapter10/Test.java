package chapter10;

/**
 * @description: 测试类
 * @author: YG.
 * @create: 2021-10-06
 **/
public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        System.out.println("圆的半径为："+circle.getRadius()+"， 颜色："+circle.getColor()+"，填充："+circle.isFilled());
        Triangle triangle=new Triangle(3,4,5);
        System.out.println("三角形的颜色为："+triangle.getColor()+"，填充："+triangle.isFilled());
        Rectangle rectangle=new Rectangle(2,3);
        System.out.println("矩形的颜色为："+rectangle.getColor()+"，填充："+rectangle.isFilled()+"，长："+rectangle.getWidth()+"，宽："+ rectangle.getHeight());
        Diamond diamond=new Diamond(4,5);
        System.out.println("菱形的对角线为："+diamond.getLongDiagonal()+" 和 "+diamond.getShortDiagonal()
        +", 颜色为："+diamond.getColor()+"， 填充："+diamond.isFilled());
    }


}
