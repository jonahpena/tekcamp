package facade.systems;

public class InventorySystem {
    public boolean checkStock(String name, int quantity) {
        //Verify items are in stock
        System.out.println("Checking Stock...\n");
        if (quantity > 0) {
            System.out.println(name + " is in Stock");
            return true;
        } else {
            //inform user purchase has failed
            System.out.println("Item is not available. Purchase failed.");
        }
        return false;
    }
}
