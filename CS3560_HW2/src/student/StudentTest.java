package student;

public class StudentTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student student1 = new Student("John", "CS", 3.5);
        Student student2 = new Student();

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }

}
