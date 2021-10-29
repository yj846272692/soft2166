package chaper19;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/25
 */
public class MyStackTest {
    public static void main(String[] args) {
        //Integer
        MyStack<Integer> myStack = new MyStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println("是否为空：" + myStack.isEmpty());
        System.out.println("Size:" + myStack.getSize());
        System.out.println("最后一个值为：" + myStack.peek());
        System.out.println(myStack.toString());
        myStack.pop();
        System.out.println(myStack);

        System.out.println("============================");

        //String
        MyStack<String> myStack1 = new MyStack<String>();
        myStack1.push("Nanjing");
        myStack1.push("Beijing");
        myStack1.push("shanghai");

        System.out.println("是否为空：" + myStack1.isEmpty());
        System.out.println("Size:" + myStack1.getSize());
        System.out.println("最后一个值为：" + myStack1.peek());
        System.out.println(myStack1.toString());
        myStack1.pop();
        System.out.println(myStack1);

    }
}
