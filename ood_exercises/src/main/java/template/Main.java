package template;

import template.derived.MadLib;

public class Main {
    public static void main(String[] args) {
        Template template = new MadLib();
        template.tellMeAStoryMethod();
    }
}
