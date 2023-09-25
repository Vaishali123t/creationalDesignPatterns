package SimpleFactory;

import java.util.Date;
import java.util.List;

public interface Order {

    Order getOrder();
    void setOrder(String orderId, List<String> products, Float orderPrice);

}
