import com.company.SecondTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThirdTask thirdTask = new ThirdTask();
         System.out.println("Pasirinkite kokios figuros plota norite skaiciuoti\na-statutis trikampis\nb-staciakampis\nc-kvadratas\nd-apskritimas");
         String selection = sc.nextLine();

         switch (selection){
             case "a":
                 System.out.println(thirdTask.trikampioPlotas(sc));
             case "b":
                 System.out.println(thirdTask.staciakampioPlotas(sc));
                 break;
             case "c":
                 System.out.println(thirdTask.kvadratoPlotas(sc));
                 break;
             case "d":
                 System.out.println(thirdTask.apskritimoPlotas(sc));
                 break;
             default:
                 System.out.println("Ka Tu nematei, kad nepateikta???");
                 break;
         }
    }
    private double trikampioPlotas(Scanner scanner){
        double a = getCorrectNumber(scanner,"Iveskite a statini");
        double b = getCorrectNumber(scanner,"Iveskite b statini");
        return (a*b)/2;

    }
    private double staciakampioPlotas(Scanner scanner){
        double a = getCorrectNumber(scanner,"Iveskite a krastines ilgi");
        double b = getCorrectNumber(scanner,"Iveskite b krastines ilgi");
        return (a*b);
    }
    private double kvadratoPlotas(Scanner scanner){
        System.out.println("Iveskite kvadrato krastines ilgi");
        double a = getCorrectNumber(scanner,"Iveskite kvadrato krastines ilgi");
        return  a*a;
    }
    private double apskritimoPlotas(Scanner scanner){
        double a = getCorrectNumber(scanner,"spindulio ilgi");
        return Math.PI*Math.pow(a, 2);//3.1415*(a*a);
    }

    private double getCorrectNumber(Scanner sc, String message){
        double result;
        while (true) {
            System.out.println(message);
            try {
                result = sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Nepavyko pakartoki");
                sc.nextLine();
            }
        }
        return result;
    }
}
