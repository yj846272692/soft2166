package chapter09;

/**
 * @author YG.
 * @description:
 * @DATE: 2021/9/27
 */
public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("Jack Chen");
        course1.addStudent("Jack Chen1");
        course1.addStudent("Jack Chen2");
        course1.addStudent("Jack Chen3");
        course1.addStudent("Jack Chen4");
        course1.addStudent("Jack Chen5");
        course1.addStudent("Jack Chen6");

        course1.dropStudent("Peter Jones");
        course1.dropStudent("Jack Chen1");
        course1.dropStudent("Jack Chen3");
        course1.dropStudent("Jack Chen5");
        course1.dropStudent("Yang JinG");

        course2.addStudent("Peter Jones2");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
    }
}


