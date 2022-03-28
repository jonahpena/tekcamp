package facade.systems;

public class PaymentSystem implements SystemLogic {
    //information is passed to the payment system

    @Override
    public void printInfo(String input) {
        System.out.println("Order for " + input + " has been placed");
    }
}
