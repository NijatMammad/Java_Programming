package Day_26_Statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {
    public String groupName;
    public int groupId;
    public ArrayList<Student> students= new ArrayList<>();


    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;

        //students=new ArrayList<>();

    }
    public void addStudent(Student student){
        students.add(student);
    }// Takes one student object, and adds it to the arraylist of students

    public void addStudent(Student[]students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudent(String name, int age, char gender, String id){
      //  Student student=new Student(name, age,gender,id);
        students.add(new Student(name, age,gender,id));

    }
    public void removeStudents(String id){
        students.removeIf(p->p.id.equals(id));

    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", students=" + students +students.size()+
                '}';
    }
}
