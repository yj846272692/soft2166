package SingerMatch;

public class School implements CompurerAverage {
    //[代码1]重写public double average(double x[])方法,返回数组x[]的元素的算术平均
    @Override
    public double average(double[] x) {
        double aver = 0;
        for (int i = 0; i < x.length; i++) {
            aver += x[i];

        }
        aver /= x.length;
        return aver;
    }

}
