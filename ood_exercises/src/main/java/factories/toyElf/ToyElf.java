package factories.toyElf;

import factories.utility.Elf;

public class ToyElf implements Elf {
    @Override
    public void gift() {
        System.out.println("Child receives a toy");
    }
}