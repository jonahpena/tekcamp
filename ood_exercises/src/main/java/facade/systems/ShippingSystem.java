package facade.systems;

public class ShippingSystem implements SystemLogic{
    //address details are sent to shipping system

    @Override
    public void printInfo(String input) {
        System.out.println("Your order is being shipped to " + input);
    }
}
