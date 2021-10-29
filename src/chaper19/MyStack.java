package chaper19;

import java.util.ArrayList;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/25
 */
public class MyStack<T> {
    private ArrayList<T> list = new ArrayList<T>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object pop() {
        T i = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return i;
    }

    public void push(T i) {
        list.add(i);
    }

    public T peek() {
        T t = list.get(getSize() - 1);
        return t;
    }

    @Override
    public String toString() {
        return "MyStack [list = " + list + "]";
    }

}
