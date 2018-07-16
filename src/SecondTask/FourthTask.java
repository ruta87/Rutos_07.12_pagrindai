package SecondTask;

import Utils.NumberUtils;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ugis = NumberUtils.getCorrectNumber(scanner, "Iveskite prasau savo ugi");
        double svoris = NumberUtils.getCorrectNumber(scanner, "Iveskite prasau savo svori");

        double result = svoris/Math.pow(ugis, 2);

        System.out.println("Jusu KMI yra:" + result);

    }
    private static double getUserKMI (double ugis, double svoris) {
        return svoris/Math.pow(ugis, 2);
    }
}
