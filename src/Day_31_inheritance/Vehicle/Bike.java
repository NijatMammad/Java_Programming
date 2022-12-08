package Day_31_inheritance.Vehicle;

public class Bike extends Vehicle {
    public Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }
    public void Ride(){
        System.out.println("Riding "+ getBrand()+" "+ getModel());
    }
}
