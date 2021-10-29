package SingerMatch;


public class Estimator {    //主类

    public static void main(String args[]) {

        double a[] = {9.89, 9.88, 9.99, 9.12, 9.69, 9.76, 8.97};

        double b[] = {56, 55.5, 65, 50, 51.5, 53.6, 70, 49, 66, 62, 46};

        CompurerAverage computer;

        computer = new SongGame();
        //【代码2】computer调用average(double x[])方法，将数组a传递给参数x
        double result = computer.average(a);

        System.out.printf("%n");

        System.out.printf("歌手最后得分:%5.3f\n", result);

        computer = new School();
        //【代码3】computer调用average(double x[])方法，将数组b传递给参数x
        result = computer.average(b);

        System.out.printf("学生平均体重:%-5.2f kg", result);

    }

}
