package factories.coalElf;

import factories.utility.Elf;

public class CoalElf implements Elf {
    @Override
    public void gift() {
        System.out.println("Child receives a chunk of coal");
    }
}
