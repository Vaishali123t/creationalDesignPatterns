package SimpleFactory;


public class Client {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        // call OrderFactory for creation of object
        Order order = OrderFactory.createOrder("Delivery");

        // use the Order object returned for specific operations
        order.getOrder();

    }

}
