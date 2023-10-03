package PrototypePattern;

public class Car implements Vehicle,VehiclePrototype{

    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Vehicle getVehilcle() {
        System.out.println("Getting Car");
        System.out.println("Name: "+ this.name);
        System.out.println("Price: "+ this.price);
        return this;
    }

    @Override
    public Vehicle clone() {
        return new Car(this.name,this.price);
    }
}
