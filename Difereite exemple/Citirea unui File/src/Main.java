//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        String select = File.separator;
        String puty = select + "D:" + select + "Java" + select + "Proecte java" + select + "Main_Test" + select + "Difereite exemple" + select + "Citirea unui File" + select + "Test.txt";
        File file = new File(puty);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
