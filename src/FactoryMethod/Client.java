package FactoryMethod;


public class Client {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        // create an object of factory which has to be called
        IOrderFactory orderFactory= new DeliveryOrderFactory();

        // call OrderFactory for creation of object
        Order order = orderFactory.createOrder();

        // use the Order object returned for specific operations
        order.getOrder();

    }

}
