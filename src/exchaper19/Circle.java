package exchaper19;

/**
 * 圆的类
 */
public class Circle implements Comparable<Circle> {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }
        return max;
    }

    @Override
    public int compareTo(Circle o) {
        if (radius < o.radius) {
            return -1;
        } else if (radius == o.radius) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
