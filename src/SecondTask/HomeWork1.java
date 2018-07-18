package SecondTask;

import Utils.NumberUtils;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = NumberUtils.getCorrectNumber(scanner, "Iveskite 1 skaiciu");
        double num1 = NumberUtils.getCorrectNumber(scanner, "Iveskite 2 skaiciu");
        double num2 = NumberUtils.getCorrectNumber(scanner, "Iveskite 3 skaiciu");
        double num3 = NumberUtils.getCorrectNumber(scanner, "Iveskite 4 skaiciu");
        double num4 = NumberUtils.getCorrectNumber(scanner, "Iveskite 5 skaiciu");

        double result = getUserSum(num, num1, num2, num3, num4);

        System.out.println("Jusu ivestu skaiciu suma:");
    }
    private static double getUserSum(double num, double num1, double num2, double num3, double num4) {return num + num1 + num2 + num3 + num4;}
}
