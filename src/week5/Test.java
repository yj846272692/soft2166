package week5;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/10/8
 */
public class Test {
    public static void main(String[] args) {


        Person person = new Person("杨晶", "江苏省盐城市", "18452555712", "846272692@qq。com");
        System.out.println(person.toString());

        Student student = new Student(Student.GRADE3, "小杨", "南京市栖霞区羊山北路一号", "12345678", "2131232143@qq。com");
        System.out.println(student.toString());

        Employee employee = new Employee("雇员一号","南京市栖霞区羊山北路一号","1844564474","98489466@qq.com","教四413",5000,new MyDate(2005,10,10));
        System.out.println(employee.toString());

        Faculty a3 = new Faculty("教员一号","南京市栖霞区羊山北路一号","11234564474","454454@qq.com","教四415",6000,new MyDate(2003,2,10),"周一至周五","高级");
        System.out.println(a3.toString());

        Staff staff = new Staff("职员一号","南京市栖霞区羊山北路一号","654561156","8655645644@qq.com","教四417",7000,new MyDate(2000,5,1),"副教授");
        System.out.println(staff.toString());

    }


}
