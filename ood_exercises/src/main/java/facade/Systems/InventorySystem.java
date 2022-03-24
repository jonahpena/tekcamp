package facade.Systems;

public class InventorySystem {
    public boolean checkStock(String name, int quantity) {
        System.out.println("Checking Stock...\n");
        if (quantity > 0) {
            System.out.println(name + " is in Stock");
            return true;
        } else {
            System.out.println("Item is not available");
        }
        return false;
    }
}