package facade.Systems;

public class PaymentSystem {
    public String placeOrder(String name, String address) {
        System.out.println("Order for " + name + " has been placed");
        return address;
    }
}
