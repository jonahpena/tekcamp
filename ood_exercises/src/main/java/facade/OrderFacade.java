package facade;

public class OrderFacade {

    private OrderProcessor processor = new OrderProcessor();

    public void processOrder(String name, int quantity) {
        if(processor.checkStock(name)) {
            String orderId = processor.placeOrder(name, quantity);
            processor.shipOrder(orderId);
        }
    }
}
