package chaper19;

import java.util.ArrayList;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/25
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //创建空的列表
        ArrayList<Integer> list = new ArrayList<Integer>();
        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //添加元素到指定下标处
        list.add(6, 7);
        //判断元素是否在数组内
        System.out.println("ArrayList contains 5 is: " + list.contains(5));
        //返回指定下标位置的元素
        Integer integer = list.get(3);
        System.out.println("下标位置的元素为：" + integer);
        //返回数组第一个匹配元素的下标
        System.out.println("第一个匹配元素的下标" + list.indexOf(1));
        //判断元素是否为空
        System.out.println("数组是否为空：" + list.isEmpty());
        //返回数组最后一个元素的下标
        list.lastIndexOf(7);
        System.out.println(list);
        //去除列表中的第一个元素
        list.remove(new Integer(1));
        System.out.println(list);
        //返回列表中的元素个数
        System.out.println("元素个数为：" + list.size());
        //去除指定下标位置的元素
        list.remove(3);
        System.out.println(list);
        //设置指定下标位置的元素
        list.set(3, 9);
        System.out.println(list);
        //清除列表中所有的元素
//        list.clear();
    }

}
