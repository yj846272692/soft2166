package week5;

/**
 * @author YG.
 * @description: 雇员类 继承"人"类
 * @DATE: 2021/10/8
 */
public class Employee extends Person {
    private String Office;
    private double salary;
    private MyDate myDate;

    protected Employee() {
    }

    protected Employee(String name, String address, String number, String Email,String Office, double salary, MyDate myDate) {
        super(name, address, number,Email);
        this.Office = Office;
        this.salary = salary;
        this.myDate = myDate;
    }

    protected String getOffice() {
        return Office;
    }

    protected double getSalary() {
        return salary;
    }

    protected MyDate getMyDate() {
        return myDate;
    }

    @Override
    public String toString() {
        return "雇员:" + getName() + " 详细信息如下" +
                "\n地址:" + getAddress() + "\n电话:" + getNumber() + "\n邮箱:" + getEmail() + "\n工资:" + getSalary() +
                "\n办公室:" + getOffice() + "\n受聘日期:" + getMyDate() + "\n";
    }


}
