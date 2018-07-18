package SecondTask;

import SecondTask.Calculator;
import Utils.NumberUtils;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int[] masyvas = new int [5];
        int i =0;
        while (true) {
            System.out.println("Veskite skaicius iki kol bus lygus 0");
            int numb = scanner.nextInt();
            masyvas[i] = numb;
            if (numb == 0){
                break;
            }
            i++;
        }
        int sum=0;
        for (int a = 0; a < masyvas.length; a++){
            sum= sum + masyvas[a] ;
            System.out.println(masyvas[a]);
        }
        System.out.println("Suma " + sum);

    }

    private static double getNumber(Scanner scanner, String numb, String message) {
        double result;
        try {
            result = Double.parseDouble(numb);
        } catch (NumberFormatException e) {
            result = NumberUtils.getCorrectNumber(scanner, message);
        }
        return result;
    }
}