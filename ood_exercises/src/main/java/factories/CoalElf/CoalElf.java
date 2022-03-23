package factories.CoalElf;

import factories.Utility.Elf;

public class CoalElf implements Elf {
    @Override
    public void gift() {
        System.out.println("You receive a chunk of coal");
    }
}
