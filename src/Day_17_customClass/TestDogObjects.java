package Day_17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Max";
        dog1.breed="Husky";
        dog1.gender='M';
        dog1.age=4;
        dog1.size="Large";
        dog1.color="Gray";

        Dog dog2=new Dog();
        dog2.name="Bella";
        dog2.breed="Golden Retriver";
        dog2.gender='F';
        dog2.age=2;
        dog2.size="Small";
        dog2.color="Orange";

        Dog dog3 =new Dog();
dog3.setInfo("Loki", "Husky", "Medium", 'F', 2, "white");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);


    }
}
