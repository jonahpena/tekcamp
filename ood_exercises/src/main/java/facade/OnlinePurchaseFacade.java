package facade;

import facade.Systems.BillingSystem;
import facade.Systems.InventorySystem;
import facade.Systems.PaymentSystem;
import facade.Systems.ShippingSystem;

public class OnlinePurchaseFacade {

    private InventorySystem inventorySystem = new InventorySystem();
    private PaymentSystem paymentSystem = new PaymentSystem();
    private ShippingSystem shippingSystem = new ShippingSystem();
    private BillingSystem billingSystem = new BillingSystem();

    public void processOrder(String name, int quantity, String address) {
        if ((inventorySystem.checkStock(name, quantity))) {
            address = paymentSystem.placeOrder(name, address);
            shippingSystem.shipOrder(address);
            billingSystem.generateBill(name, address);
        }
    }
}
