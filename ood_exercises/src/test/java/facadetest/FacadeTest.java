package facadetest;

import facade.OnlinePurchaseFacade;
import facade.systems.ShippingSystem;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacadeTest {
    private ShippingSystem shippingSystem = new ShippingSystem();
    @Test
    public void shippingSystemShouldReturnString() {
//        //arrange
//        actual = shippingSystem.shipOrder("P. Sherman, 42 Wallaby Way, Sydney");
//        String expected = "Your order is being shipped to P. Sherman, 42 Wallaby Way, Sydney";
//
//        //assert
//        Assert.assertEquals(actual,expected);
    }
}