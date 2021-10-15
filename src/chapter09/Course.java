package chapter09;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/9/27
 */
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    //创建一个带特定名称得课程
    public Course(String courseName) {
        this.courseName = courseName;
    }

    //返回课程名
    public String getCourseName() {
        return courseName;
    }

    //返回这门课程的学生
    public String[] getStudents() {
        return students;
    }

    //返回这门课程的学生人数
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    //给这门课程添加一个新同学
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    //从这门课程中删除一个学生
    public void dropStudent(String student) {
        //创建新的数组
        String[] newStudent = new String[students.length];
        int index = 0;
        for (index = 0; index < 100; index++) {
            if (students[index] == null)
                index = 100;
            else if (students[index].equals(student))
                break;
        }
        //找到要删除学生的index
        if (index < 100) {
            for (int i = 0; i < newStudent.length - 1; i++) {
                if (i < index)
                    //删除学生名字之前的名字复制到新创建的数组
                    newStudent[i] = getStudents()[i];
                else
                    //删除学生名字之后的名字复制到新创建的数组
                    newStudent[i] = getStudents()[i + 1];
            }
            //新数组引用值赋值给原来的数组
            students = newStudent;
            numberOfStudents--;
        } else
            System.out.println("选课名单里没有该名学生！");
    }

}
