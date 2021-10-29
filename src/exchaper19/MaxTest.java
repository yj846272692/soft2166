package exchaper19;


/**
 * 测试程序
 */
public class MaxTest {
    public static void main(String[] args) {
        Circle maxTest = new Circle();
        Circle[] circles = {new Circle(3), new Circle(5), new Circle(3.5)};
        System.out.println("最大值:" + maxTest.max(circles));
    }
}
