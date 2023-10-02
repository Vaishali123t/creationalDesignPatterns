package FactoryMethod;

public class DiningOrderFactory implements IOrderFactory{
    @Override
    public Order createOrder() {
        return new DiningOrder();
    }
}
