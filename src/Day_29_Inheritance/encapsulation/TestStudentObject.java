package Day_29_Inheritance.encapsulation;

public class TestStudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Nijat",38,'M','A', "MIT");
        System.out.println(student1);
        student1.setSchoolName("Harvard");
        student1.setGrade('B');
    }

}
