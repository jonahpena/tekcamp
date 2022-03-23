package factories.ToyElf;

import factories.Utility.Elf;
import factories.Utility.ElfAbstractFactory;

public class ToyElfFactory extends ElfAbstractFactory {
    @Override
    public Elf createElf(String type) {
        Elf elf = null;

        if (type.equals("nice")){
            elf = new ToyElf();
        }

        return elf;
    }
}
