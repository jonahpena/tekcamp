package factories.ToyElf;

import factories.Utility.Elf;

public class ToyElf implements Elf {
    @Override
    public void gift() {
        System.out.println("Child receives a toy");
    }
}
