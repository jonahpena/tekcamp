package template.Derived;

import template.Template;

public class Original extends Template {
    @Override
    public String getFirstName() {
        return "Midas";
    }
    @Override
    public String getSecondName() {
        return "Satyr";
    }
    @Override
    public String getThirdName() {
        return "Dionysus";
    }
    @Override
    public String getDrink() {
        return "wine";
    }
    @Override
    public String getElement() {
        return "gold";
    }
}
