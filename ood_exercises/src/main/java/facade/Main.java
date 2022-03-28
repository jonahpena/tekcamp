package facade;

public class Main {
    public static void main(String[] args) {
        OnlinePurchaseFacade facade = new OnlinePurchaseFacade();
        //Purchase Request
        facade.processOrder("iPhone", 3, "P. Sherman, 42 Wallaby Way, Sydney");
    }
}