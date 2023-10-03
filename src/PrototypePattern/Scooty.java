package PrototypePattern;

public class Scooty implements VehiclePrototype, Vehicle {

    private String name;
    private Integer price;

    public Scooty(String name, Integer price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public Vehicle clone() {
        return new Scooty(this.name,this.price);
    }

    @Override
    public Vehicle getVehilcle() {
        System.out.println("Getting Scooty");
        System.out.println("Name: "+ this.name);
        System.out.println("Price: "+ this.price);
        return this;
    }
}
