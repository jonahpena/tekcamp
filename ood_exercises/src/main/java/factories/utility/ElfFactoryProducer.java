package factories.utility;

import factories.toyElf.ToyElfFactory;
import factories.coalElf.CoalElfFactory;

public class ElfFactoryProducer {
    public static ElfAbstractFactory produce(String factoryType) {
        ElfAbstractFactory eaf = null;

        if(factoryType.equals("nice")){
            eaf = new ToyElfFactory();
        } else if (factoryType.equals("naughty")) {
            eaf = new CoalElfFactory();
        }

        return eaf;
    }
}
