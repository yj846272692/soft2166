package chapter09;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/9/23
 */
public class Money {
    public static void main(String[] args) {
        //标准的输入流
        Scanner scanner = new Scanner(System.in);
        //总余额与月余额
        float value = 0;
        float number = 0;
        for (int i = 0; i < 12; i++) {
            number = Float.parseFloat(scanner.nextLine());
            value += number;
        }
        //保留两位小数
        DecimalFormat df = new DecimalFormat(".00");
        //计算平均值，并且转换为美元，汇率6.5
        float result = (float) ((float) value / (12.0 * 6.5));
        String str = df.format(result);
        System.out.println("期末余额平均值为:" + "$" + str);
    }
}

