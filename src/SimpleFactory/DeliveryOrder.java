package SimpleFactory;

import java.util.List;

public class DeliveryOrder implements Order {


    @Override
    public Order getOrder() {
        System.out.println("Trying to get Delivery Order");
        return null;
    }

    @Override
    public void setOrder(String orderId, List<String> products, Float orderPrice) {
        System.out.println("Delivery Order has been set");
    }
}
