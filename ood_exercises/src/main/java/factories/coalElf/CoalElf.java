package factories.coalElf;

import factories.utility.Elf;

public class CoalElf implements Elf {
    @Override
    public String gift() {
        System.out.println("Child receives chunk of coal");
        return "Child receives a chunk of coal";
    }
}