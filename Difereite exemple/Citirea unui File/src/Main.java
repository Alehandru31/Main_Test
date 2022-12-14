//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) throws FileNotFoundException {
       // Prima metoda de indicare a adresei pina la file
        String select = File.separator;
        String puty = select + "D:" + select + "Java" + select + "Proecte java" + select + "Main_Test" + select + "Difereite exemple" + select + "Citirea unui File" + select + "Test.txt";
        File file = new File(puty);

        Scanner scanner = new Scanner(file);
//Exemplu de a citi text format txt cu mai multe rinduri
//        while(scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
// Citim text cu un rind si il incarcam in masiv cifrele din file
        String line =scanner.nextLine();
        String[] number=line.split(" ");

        int[] numbers =new int[6];
        int index=0;
        for (String numberList: number) {
            numbers[index++] = Integer.parseInt(numberList);
        }
            System.out.print(Arrays.toString(numbers));
        scanner.close();
    }
}
