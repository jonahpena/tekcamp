package factoriestest;

import factories.coalElf.CoalElf;
import factories.toyElf.ToyElf;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactoriesTest {

    ToyElf toyElf = new ToyElf();
    CoalElf coalElf = new CoalElf();

    @Test
    public void giftShouldReturnToyElfString() {
        String actual = toyElf.gift();
        String expected = "Child receives a toy";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void giftShouldReturnCoalElfString() {
        String actual = coalElf.gift();
        String expected = "Child receives a chunk of coal";

        Assert.assertEquals(actual, expected);
    }
}