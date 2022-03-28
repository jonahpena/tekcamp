package facadetest;

import facade.systems.ShippingSystem;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacadeTest {

    ShippingSystem shippingSystem = new ShippingSystem();
    @Test
    public void shipOrderShouldReturnString() {
        String actual = shippingSystem.shipOrder("P. Sherman, 42 Wallaby Way, Sydney");
        String expected = "Your order is being shipped to P. Sherman, 42 Wallaby Way, Sydney";

        Assert.assertEquals(actual,expected);
    }
}