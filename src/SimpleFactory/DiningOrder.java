package SimpleFactory;

import java.util.List;

public class DiningOrder implements Order{
    @Override
    public Order getOrder() {
        System.out.println("Trying to get Dining Order");
        return null;
    }

    @Override
    public void setOrder(String orderId, List<String> products, Float orderPrice) {
        System.out.println("Dining Order has been set");
    }
}
