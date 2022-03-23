package facade;

public class Main {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();
        facade.processOrder("MacBook",3);
    }
}
