package SecondTask;

import java.util.Scanner;

public class Homework_1 {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nurodykite kiek skaiciu ketinate ivesti?");
        int size = scanner.nextInt();
        test(size, scanner);
    }

        private static void test(int size, Scanner scanner) {
        for (int i = 0; i < size; i++){
            System.out.println("Iveskite" + i + "elementa");
            int numb = scanner.nextInt();
        }

    }
}
