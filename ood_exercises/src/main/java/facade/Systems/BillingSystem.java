package facade.Systems;

public class BillingSystem {
    public void generateBill(String name, String address) {

        System.out.println("\nOrder complete. Find your bill below:");
        System.out.println("+---------------------------------------+");
        System.out.println("|  Item Purchased:                      |");
        System.out.println("|  " + name + "                              |");
        System.out.println("|                                       |");
        System.out.println("|  Shipping Address:                    |");
        System.out.println("|  " + address + "   |");
        System.out.println("+---------------------------------------+");
    }
}
