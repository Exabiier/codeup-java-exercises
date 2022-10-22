package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("student1", 50);
            student1.addGrade(50);
            student1.addGrade(50);
        System.out.println(student1.getGradeAverage());

    }
}
