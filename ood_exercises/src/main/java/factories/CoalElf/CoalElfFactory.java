package factories.CoalElf;

import factories.Utility.Elf;
import factories.Utility.ElfAbstractFactory;

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
