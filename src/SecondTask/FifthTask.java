package SecondTask;

import Utils.NumberUtils;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kilometrai = NumberUtils.getCorrectNumber(scanner, "Iveskite prasau nuvaziuotus km: ");
        double kuras = NumberUtils.getCorrectNumber(scanner, "Iveskite prasau kuro sanausas km/100: ");

        double result = (kuras*100)/kilometrai;

        System.out.println("Jusu automobilio vidutinis sunaudota kuro norma:" + result);
    }
    private static double getUserAverage (double kilometrai, double kuras) {
        return (kuras*100)/kilometrai;
    }
}
