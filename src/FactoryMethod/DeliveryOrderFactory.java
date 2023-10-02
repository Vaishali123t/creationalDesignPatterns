package FactoryMethod;

public class DeliveryOrderFactory implements IOrderFactory{

    @Override
    public Order createOrder() {
        return new DeliveryOrder();
    }
}
