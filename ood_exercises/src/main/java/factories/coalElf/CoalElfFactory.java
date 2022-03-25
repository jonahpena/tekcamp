package factories.coalElf;

import factories.utility.Elf;
import factories.utility.ElfAbstractFactory;

public class CoalElfFactory extends ElfAbstractFactory {
    @Override
    public Elf createElf(String type) {
        Elf elf = null;

        if (type.equals("naughty")) {
            elf = new CoalElf();
        }

        return elf;
    }
}
