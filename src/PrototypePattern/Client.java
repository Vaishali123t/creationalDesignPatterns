package PrototypePattern;

public class Client {

    public static void main(String[] args) {

        // create protypes of scooty and car
        VehiclePrototype scooty= new Scooty("Activa",40000);
        System.out.println(scooty);
        VehiclePrototype car= new Car("Tata nexon",1000000);

        // Clone and display scooty and car vehicles
        Vehicle scootyClone= scooty.clone();
        Vehicle carClone= car.clone();

        System.out.println(scootyClone.getVehilcle());
        System.out.println(carClone.getVehilcle());


    }


}
