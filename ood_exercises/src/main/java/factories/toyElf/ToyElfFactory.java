package factories.toyElf;

import factories.utility.Elf;
import factories.utility.ElfAbstractFactory;

public class ToyElfFactory extends ElfAbstractFactory {
    @Override
    public Elf createElf(String type) {
        Elf elf = null;

        if (type.equals("nice")) {
            elf = new ToyElf();
        }

        return elf;
    }
}
