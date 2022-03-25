package templatetest;

import org.testng.Assert;
import org.testng.annotations.Test;
import template.Template;
import template.derived.MadLib;

public class TemplateTest {
    Template template = new MadLib();

    @Test
    public void testShouldReturnCorrectElement() {

        String actual = template.getElement();
        String expected = "Ice";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShouldReturnCorrectDrink() {
        String actual = template.getDrink();
        String expected = "Whiskey";

        Assert.assertEquals(actual, expected);
    }
}