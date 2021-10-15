package week5;

/**
 * @author YG.
 * @description: 职员类 继承雇员类
 * @DATE: 2021/10/8
 */
public class Staff extends Employee {
    private String Post;


    public Staff(String name, String address, String number, String Email, String Office, double salary, MyDate myDate, String post) {
        super(name, address, number, Email, Office, salary, myDate);
        this.Post = post;
    }

    public String getPost() {
        return Post;
    }


    @Override
    public String toString() {
        return "职员:" + getName() + " 详细信息如下" +
                "\n地址:" + getAddress() + "\n电话:" + getNumber() + "\n邮箱:" + getEmail() + "\n工资:" + getSalary() +
                "\n办公室:" + getOffice() + "\n职称:" + getPost() + "\n受聘日期:" + getMyDate() + "\n";
    }

    ;
}


