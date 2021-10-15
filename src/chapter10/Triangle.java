package chapter10;

/**
 * @description: 子类-三角形
 * @author: YG.
 * @create: 2021-10-06
 **/
public class Triangle extends Geometry{
    private int a;
    private int b;
    private  int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, boolean filled, int a, int b, int c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
