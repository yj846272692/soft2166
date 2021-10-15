package totalArea;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/8
 */
public class TotalArea {
    Geometry[] tuxing;
    double totalArea = 0;

    public void setTuxing(Geometry[] t) {

        tuxing = t;

    }

    public double computerTotalArea() {

        //【代码3】用循环语句让tuxing的元素调用getArea方法，并将返回的值累加到totalArea
        for (int i = 0; i < tuxing.length; i++) {
            totalArea = totalArea + tuxing[i].getArea();
        }

        return totalArea;

    }
}
