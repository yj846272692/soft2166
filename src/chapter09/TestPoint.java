package chapter09;

import java.util.Scanner;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/9/18
 */
public class TestPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //计算两点之间的距离
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(10,30.5);
        System.out.println("P1和P2两点之间的距离是："+ MyPoint.distance(p1,p2));
        //计算P1和P2两点之间的距离(P1是"该点")
        System.out.println("从P1到P2的距离是："+p1.distance(p2));
        //计算P1和P2两点之间的距离(P2是"该点")
        System.out.println("从P2到P1的距离是："+p2.distance(p1));
        //从P1到指定点(10,20)的距离
        System.out.println("从P1到指定点的距离是："+p1.distance(10,20));
        //从P2到指定点(10,20)的距离
        System.out.println("从P2到指定点的距离是："+p2.distance(10,20));

    }
}
