package facade;

public class OrderFacade {
    private CheckStock checkStock = new CheckStock();
    private PlaceOrder placeOrder = new PlaceOrder();
    private ShipOrder shipOrder = new ShipOrder();

    public void processOrder(String name, int quantity) {
        if((checkStock.checkStock(name))) {
            String orderId = placeOrder.placeOrder(name, quantity);
            shipOrder.shipOrder(orderId);
        }
    }
}









//    private OrderProcessor processor = new OrderProcessor();
