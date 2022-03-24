package factories;

import factories.Utility.Elf;
import factories.Utility.ElfAbstractFactory;
import factories.Utility.ElfFactoryProducer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        ElfAbstractFactory eaf = ElfFactoryProducer.produce(userInput);
        Elf elf = eaf.createElf(userInput);

        elf.gift();
    }
}
