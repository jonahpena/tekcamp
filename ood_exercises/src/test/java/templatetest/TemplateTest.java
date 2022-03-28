package templatetest;

import org.testng.Assert;
import org.testng.annotations.Test;
import template.Template;
import template.derived.MadLib;
import template.derived.Original;

public class TemplateTest {
    Template templateMadLib = new MadLib();
    Template templateOriginal = new Original();

    @Test
    public void getElementShouldReturnMadLibElement() {
        String actual = templateMadLib.getElement();
        String expected = "ice";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getDrinkShouldReturnMadLibDrink() {
        String actual = templateMadLib.getDrink();
        String expected = "whiskey";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getElementShouldReturnOriginalElement() {
        String actual = templateOriginal.getElement();
        String expected = "gold";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getDrinkShouldReturnOriginalDrink() {
        String actual = templateOriginal.getDrink();
        String expected = "wine";
        Assert.assertEquals(actual, expected);
    }
}