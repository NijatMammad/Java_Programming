package Day_28_encapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student=new Student();
       // student.age=20;
       // System.out.println(student.age);

        student.setAge(20);

        System.out.println(student.getAge());
        System.out.println("Test Completed");
        }
    }
