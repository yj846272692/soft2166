package chapter10;

/**
 * @description: 子类-菱形
 * @author: YG.
 * @create: 2021-10-06
 **/
public class Diamond extends Geometry{
    private int longDiagonal;
    private int shortDiagonal;


    public Diamond() {
    }

    public Diamond(int longDiagonal, int shortDiagonal) {
        this.longDiagonal = longDiagonal;
        this.shortDiagonal = shortDiagonal;
    }

    public Diamond(String color, boolean filled, int longDiagonal, int shortDiagonal) {
        super(color, filled);
        this.longDiagonal = longDiagonal;
        this.shortDiagonal = shortDiagonal;
    }

    public int getLongDiagonal() {
        return longDiagonal;
    }

    public void setLongDiagonal(int longDiagonal) {
        this.longDiagonal = longDiagonal;
    }

    public int getShortDiagonal() {
        return shortDiagonal;
    }

    public void setShortDiagonal(int shortDiagonal) {
        this.shortDiagonal = shortDiagonal;
    }
}
