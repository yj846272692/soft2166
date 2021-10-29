package exchaper19;

import java.util.ArrayList;

/**
 * 去除数组中的重复元素
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);
        ArrayList<Integer> resultList = removeDuplicates(arrayList);
        System.out.println(resultList);


    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> result = new ArrayList<E>();
        for (E i:list) {
            if (!result.contains(i)){
                result.add(i);
            }

        }
        return result;
    }
}
