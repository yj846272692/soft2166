package week5;

/**
 * @author YG.
 * @description: 学生类 继承"人"类
 * @DATE: 2021/10/8
 */
public class Student extends Person {
    public static final String GRADE1 = "大一", GRADE2 = "大二", GRADE3 = "大三", GRADE4 = "大四";
    private String StudentState;


    public Student(String StudentState, String name, String address, String number, String Email) {
        super(name, address, number, Email);
        this.StudentState = StudentState;
    }

    public String getStudentState() {
        return StudentState;
    }

    @Override
    public String toString() {
        return "学生:" + getName() + " 详细信息如下" +
                "\n地址:" + getAddress() + "\n电话:" + getNumber() + "\n邮箱地址:" + getEmail() + "\n年级:" + getStudentState() + "\n";
    }


}

