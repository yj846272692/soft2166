package chaper19;


import java.util.ArrayList;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/25
 */
public class Test {
    public static void main(String[] args) {
        Integer[] intList = {1, 2, 3, 4, 5, 6};


        String[] strList = {"London", "Paris", "New York", "Beijing", "Nanjing"};

        Double[] doubleList = {1.1, 1.2, 2.1, 2.3, 4.5};

        Integer[] intList3 =  new Integer[10];

        ArrayList<Integer> intList4 =  new ArrayList<Integer>();



        Test.<Integer>print(intList);
        System.out.println("最大值是：" + max(intList));
        print(strList);
        System.out.println("最大值是：" + max(strList));
    }

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E result = list[0];
        for (int i = 0; i < list.length; i++) {
            if (result.compareTo(list[i]) < 0)
                result = list[i];
        }
        return result;
    }
}
