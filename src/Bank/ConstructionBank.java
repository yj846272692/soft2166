package Bank;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/8
 */
public class ConstructionBank extends Bank {
    double year;


    public double computerInterest() {
        super.year = (int) year;
        double r = year - (int) year;
        int day = (int) (r * 1000);
        //【代码1】super调用隐藏的computerInterest()方法
        double yearInterest = super.computerInterest();
        double dayInterest = day * 0.0001 * savedMoney;
        interest = yearInterest + dayInterest;
        System.out.printf("%d元存在建设银行%d年零%d天的利息:%f元\n", savedMoney, super.year, day, interest);
        return interest;

    }
}
