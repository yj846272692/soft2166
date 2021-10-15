package week5;

/**
 * @author YG.
 * @description: 教员类 继承雇员类
 * @DATE: 2021/10/8
 */
public class Faculty extends Employee {

    private String OfficeTime;
    private String PostGrade;


    public Faculty(String name, String address, String number, String Email, String Office, double salary, MyDate myDate, String officeTime, String postGrade) {
        super(name, address, number, Email, Office, salary, myDate);
        this.OfficeTime = officeTime;
        this.PostGrade = postGrade;
    }

    public String getOfficeTime() {
        return OfficeTime;
    }

    public String getPostGrade() {
        return PostGrade;
    }


    @Override
    public String toString() {
        return "教员:" + getName() + " 详细信息如下" +
                "\n地址:" + getAddress() + "\n电话:" + getNumber() + "\n邮箱:" + getEmail() + "\n工资:" + getSalary() +
                "\n办公室:" + getOffice() + "\n级别:" + getPostGrade() + "\n办公时间:" + getOfficeTime() +
                "\n受聘日期:" + getMyDate() + "\n";
    }


}
