package SecondTask;

import Utils.NumberUtils;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String line = "";

        while (!line.equals("q")) {
            System.out.println("Veskite du skaicius ir veiksma tarp ju, pvz. '20 + 20'");

            line = scanner.nextLine();
            String[] items = line.split(" ");
            if (items.length == 3) {
                double numb = getNumber(scanner, items[0], "Pakartokite pirmo skaiciaus ivedima");
                double numb2 = getNumber(scanner, items[2], "Pakartokite antro skaiciaus ivedima");

                switch (items[1]) {
                    case "+":
                        double result = calculator.sum(numb, numb2);
                        System.out.println("Suma " + result);
                        break;
                    case "-":
                        double result1 = calculator.min(numb, numb2);
                        System.out.println("Skirtumas " + result1);
                        break;
                    case "/":
                        while (numb2 == 0) {
                            numb2 = NumberUtils.getCorrectNumber(scanner, "Ivestas skaicius neturi buti lygus 0");
                        }
                        double result2 = calculator.div(numb, numb2);
                        System.out.println("Dalybos atsakymas " + result2);
                        break;
                    case "*":
                        double result3 = calculator.multiplication(numb, numb2);
                        System.out.println("Daugybos atsakymas "+ result3);
                        break;
                    case "Math.pow":
                        double result4 = calculator.Math(numb, numb2);
                        System.out.println("Pakeltas kvadratu "+result4);
                        break;
                }
            } else if (!line.equals("q")){
                System.out.println("Blogas formatas");
            }
        }
    }
    private static double getNumber(Scanner scanner, String numb, String message) {
        double result;
        try {
            result = Double.parseDouble(numb);
        }catch (NumberFormatException e) {
            result = NumberUtils.getCorrectNumber(scanner,message);
        }
        return result;
    }
}
