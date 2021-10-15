package chapter10;

/**
 * @description: 父类
 * @author: YG.
 * @create: 2021-10-06
 **/
public class Geometry {
    private String color;
    private boolean filled;

    public Geometry() {
        this.color="red";
        this.filled=false;
    }

    public Geometry(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
