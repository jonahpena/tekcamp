package facade.systems;

public class ShippingSystem {
    //address details are sent to shipping system
    public void shipOrder(String address) {
        System.out.println("Your order is being shipped to " + address);
    }
}
