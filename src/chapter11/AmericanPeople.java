package chapter11;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/6
 */
public class AmericanPeople extends People {
    //【代码2】 重写public void speakHello()方法，输出"How do you do"
    public void speakHello() {
        System.out.println("How do you do");
    }

    //【代码3】 重写public void averageHeight()方法，输出"American's average height:176 cm"
    public void averageHeight() {
        height = 176;
        System.out.println("American's average height" + height + "cm");
    }

    public void averageWeight() {

        weight = 75;

        System.out.println("American's average weight:" + weight + " kg");

    }

    public void americanBoxing() {

        System.out.println("直拳、钩拳、组合拳");

    }
}
