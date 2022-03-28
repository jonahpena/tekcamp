package factories.toyElf;

import factories.utility.Elf;

public class ToyElf implements Elf {
    @Override
    public String gift() {
        System.out.println("Child receives a toy");
        return "Child receives a toy";
    }
}