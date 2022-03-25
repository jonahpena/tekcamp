package template.derived;

import template.Template;

public class MadLib extends Template {
    @Override
    public String getFirstName() {
        return "Jonah";
    }
    @Override
    public String getSecondName() {
        return "Kat";
    }
    @Override
    public String getThirdName() {
        return "Tim";
    }
    @Override
    public String getDrink() {
        return "Whiskey";
    }
    @Override
    public String getElement() {
        return "Ice";
    }
}
