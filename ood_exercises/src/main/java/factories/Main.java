package factories;

import factories.utility.Elf;
import factories.utility.ElfAbstractFactory;
import factories.utility.ElfFactoryProducer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You have a list of 3 children. Enter 'naughty' or 'nice' to determine the appropriate " +
                "gift for each child on your list.");
        int i = 0;
        while (i < 3) {
            String userInput = scanner.nextLine();
            ElfAbstractFactory eaf = ElfFactoryProducer.produce(userInput);
            Elf elf = eaf.createElf(userInput);
            elf.gift();
            i++;
        }
        System.out.println("\nThank you for using our gift determination software. Have a great day!");
    }
}
