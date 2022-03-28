package facade.systems;

public class ShippingSystem {
    //address details are sent to shipping system
    public String shipOrder(String address) {

        return "Your order is being shipped to " + address;
    }
}
