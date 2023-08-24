package homework;

public class Car {
    private String make;
    private String model;
    private int miles;
    private int price;
    private int doors;

    public Car(String make, String model, int miles, int price, int doors) {
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.price = price;
        this.doors = doors;
    }

    public void drive(int miles){
        this.miles = miles + miles;
        System.out.println(make + model +" drive for "+  miles);
    }
    public void forsale (int price){
        this.price=price;
        System.out.println("selling "+ make + model +" for $ "+ price );
    }
}
