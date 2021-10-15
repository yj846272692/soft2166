package dataStructure;
import java.lang.*;


/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/15
 */
public class sqList {
    final int initCapacity = 50; // 顺序表的初始容量
    private int[] data; // 存放顺序表的元素
    private int size; // 存放顺序表的长度，即顺序表中的元素个数
    private int capacity; // 存放顺序表的容量

    // 初始化顺序表
    public sqList() {
        data = new int[initCapacity];
        capacity = initCapacity;
        size = 0;
    }

    // 改变顺序表的容量
    private void updateCapacity(int newCapacity) {
        int[] newData = new int[newCapacity];
        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        capacity = newCapacity;
        data = newData;
    }

    // 整体建立顺序表
    public void CreateList(int[] a) {
        int i, k = 0;
        for (i = 0; i < a.length; i++) {
            if (size == capacity) // 出现上溢出时
                updateCapacity(2 * size); // 扩大容量
            data[k] = a[i];
            k++; // 添加的元素个数增加1
        }
        size = k;
        // 修改顺序表中元素的个数
    }

    //////////////////////////////////////////////////////////
    // 顺序表的基本运算

    // 将元素e添加到线性表末尾
    public void Add(int e) {
        // 顺序表空间满时，扩容
        if (size == initCapacity)
            updateCapacity(2 * size);
        // 添加元素，顺序表容量加1
        data[size] = e;
        size++;

    }

    // 求线性表的长度size
    public int Size() {
        return size;
    }

    // 设置线性表的长度，缩短顺序表的长度
    public void Setsize(int nlen) {
        // 长度不在有效值范围内
        if (nlen < 0 || nlen > size)
            throw new IllegalArgumentException("设置长度不在有效范围内");
        // 否则
        size = nlen;

    }

    // 查找序号为i的元素
    public int GetElem(int i) {
        // 序号i不在有效值范围内
        if (i < 0 || i > size - 1)
            throw new IllegalArgumentException("序号i不在有效范围内");
        // 否则
        return data[i];

    }

    // 设置顺序表中序号为i的元素值
    public void SetElem(int i, int e) {
        // 序号i不在有效值范围内
        if (i < 0 || i > size - 1)
            throw new IllegalArgumentException("序号i不在有效范围内");
        data[i] = e;
    }

    // 查找第一个值为e的元素序号
    public int GetNo(int e) {
        int i = 0;
        // 查找元素e
        while (i < size && data[i] != e)
            i++; // 查找元素e
        if (i >= size) // 未找到时返回-1
            // 未找到时返回-1
            return -1;
            // 返回元素序号
        else
            return i;
    }

    // 交换序号i和序号j的元素值
    public void Swap(int i, int j) {
        // 注意交换顺序
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    // 插入e作为第i个元素
    public void Insert(int i, int e) {
        // 插入元素的有效值范围
        if (i < 0 || i > size)
            throw new IllegalArgumentException("序号i不在有效范围内");
        // 如果满了扩容2倍
        if (size == capacity)
            updateCapacity(2 * size);
        // 插入操作
        for (int j = size; j > i; j--)
            data[j] = data[j - 1];
        data[i] = e;
        size++;

    }

    // 删除第i个元素
    public void Delete(int i) {
        // 删除元素的有效值范围
        if (i < 0 || i > size - 1)
            throw new IllegalArgumentException("序号i不在有效范围内");
        // 删除操作
        for (int j = i; j < size - 1; j++)
            data[j] = data[j + 1];
        size--;
    }

    // 打印线性表元素
    public void print() {
        for (int i = 0; i < size; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        sqList linearList = new sqList();

        // 数组整体创建顺序表;
        int[] a = { 0, 1, 2, 7, 4, 5, 6, 7, 8, 9 };
        linearList.CreateList(a);
        // 打印顺序表
        linearList.print();

        // 查找元素下标
        int e = 7;
        int pos = linearList.GetNo(e);
        if (pos == -1)
            System.out.println("您要找的 " + e + " 元素不在该线性表中");
        else
            System.out.println("您要找的 " + e + " 元素下标为：" + pos);

        // 交换i=3，j=6的元素
        linearList.Swap(3, 6);
        linearList.print();

        // i=5位置插入元素e=9
        linearList.Insert(5, 9);
        linearList.print();

        // 删除i=8位置的元素
        linearList.Delete(8);
        linearList.print();
    }
}
