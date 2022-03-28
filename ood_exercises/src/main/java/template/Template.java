package template;

import java.util.Locale;

public abstract class Template {

    public abstract String getFirstName();

    public abstract String getSecondName();

    public abstract String getThirdName();

    public abstract String getDrink();

    public abstract String getElement();

    public void tellMeAStoryMethod() {
        System.out.println("There once was a king named " + getFirstName() + " who did a good deed for a "+ getSecondName() + ". And he was then " +
                "granted a wish by " + getThirdName() + ", the god of "+ getDrink() + ". " +
                "\nFor his wish, " + getFirstName() + " asked that whatever he touched would turn to " + getElement() + ". Despite "+ getThirdName() +"’ efforts to " +
                "prevent it, " + getFirstName() + " pleaded that this was a fantastic wish, and so, it was bestowed.\n" +
                "Excited about his newly-earned powers, " + getFirstName() + " started touching all kinds of things, turning each item" +
                " into pure " + getElement() + ".\n" +
                "\n" +
                "Soon, " + getFirstName() + " became hungry. As he picked up a piece of food, he found he couldn’t eat it. It had " +
                "turned to " + getElement() + " in his hand. " +
                "Hungry, " + getFirstName() + " groaned, “I’ll starve! Perhaps this was not such an excellent wish after all!”\n" +
                "Seeing his dismay, " + getFirstName() + "’ beloved daughter threw her arms around him to comfort him, and she, too, " +
                "turned to " + getElement() + ". “The "+ getElement() + " touch is no blessing,” " + getFirstName() + " cried.");
    }
}

