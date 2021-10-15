package chapter11;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/6
 */
public class BeijingPeople extends ChinaPeople {
    //【代码4】重写public void averageHeight()方法, 输出:"北京人的平均身高:172.5厘米"
    public void averageHeight() {
        height = 172.5;
        System.out.println("中国人的平均身高:" + height + "厘米");
    }

    //【代码5】重写public void averageWeight()方法,输出:"北京人的平均体重:70公斤"
    public void averageWeight() {
        weight = 70;
        System.out.println("中国人的平均体重:" + weight + "千克");
    }

    public void beijingOpera() {

        System.out.println("花脸、青衣、花旦和老生");

    }
}
