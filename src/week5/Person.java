package week5;

/**
 * @author YG.
 * @description:父类 ："人"类
 * @DATE: 2021/10/8
 */
public class Person {
    private String name;
    private String address;
    private String number;
    private String Email;

    protected Person() {
    }

    protected Person(String name, String address, String number, String Email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.Email = Email;

    }

    protected String getName() {
        return name;
    }

    protected String getAddress() {
        return address;
    }

    protected String getNumber() {
        return number;
    }

    protected String getEmail() {
        return Email;
    }

    public String toString() {
        return "Person:" + getName() + " 详细信息如下：" +
                "\n地址:" + getAddress() + "\n电话:" + getNumber() + "\n邮箱地址:" + getEmail() + "\n";
    }


}





