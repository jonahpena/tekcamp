package facadetest;

import facade.systems.InventorySystem;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacadeTest {

    private InventorySystem inventorySystem = new InventorySystem();

    @Test
    public void inventorySystemShouldReturnTrue() {
        boolean actual = inventorySystem.checkStock("iPhone", 2);
        boolean expected = true;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void inventorySystemShouldReturnFalse() {
        boolean actual = inventorySystem.checkStock("iPhone", 0);
        boolean expected = false;

        Assert.assertEquals(actual, expected);
    }
}