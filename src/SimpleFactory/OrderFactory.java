package SimpleFactory;

public class OrderFactory {

    static Order order;

    public static Order createOrder(String orderType){

        if(orderType=="Dining"){
            order= new DiningOrder();
            System.out.println("Dining Order created");
        }
        else if (orderType=="Delivery") {
            order= new DeliveryOrder();
            System.out.println("Delivery Order created");
        }
        return order;
    }
}
