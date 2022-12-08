package Day_28_encapsulation.personTask;

public class TestPersonsObject {
    public static void main(String[] args) {


    Person person1=new Person("Mohammad");
    Person person2=new Person("Sabina",'F');
    Person person3=new Person("Murad", 12);
    Person person4=new Person("Alperen", "English");
    Person person5=new Person("Nijat", 38);
    Person person6=new Person("Marry", 23, 'F', "English");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);
    }
}

