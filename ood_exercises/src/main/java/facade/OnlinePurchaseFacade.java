package facade;

import facade.systems.BillingSystem;
import facade.systems.InventorySystem;
import facade.systems.PaymentSystem;
import facade.systems.ShippingSystem;

public class OnlinePurchaseFacade {

    private InventorySystem inventorySystem = new InventorySystem();
    private PaymentSystem paymentSystem = new PaymentSystem();
    private ShippingSystem shippingSystem = new ShippingSystem();
    private BillingSystem billingSystem = new BillingSystem();

    public void processOrder(String name, int quantity, String address) {
        if ((inventorySystem.checkStock(name, quantity))) {
            paymentSystem.placeOrder(name);
            shippingSystem.shipOrder(address);
            billingSystem.generateBill(name, address);
        }
    }
}
