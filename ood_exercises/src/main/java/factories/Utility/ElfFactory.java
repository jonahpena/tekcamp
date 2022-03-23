package factories.Utility;

import factories.CoalElf.CoalElf;
import factories.ToyElf.ToyElf;

public class ElfFactory extends ElfAbstractFactory {
    @Override
    public Elf createElf(String type) {
        Elf elf = null;

        if (type.equals("naughty")){
            elf = new CoalElf();
        }
        else if (type.equals("nice")) {
            elf = new ToyElf();
        }
        return elf;
    }
}