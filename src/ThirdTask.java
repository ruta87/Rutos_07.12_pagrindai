import com.company.SecondTask;

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
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b statini");
        double b = scanner.nextDouble();
        return (a*b)/2;

    }
    private double staciakampioPlotas(Scanner scanner){
        System.out.println("Iveskite a krastines ilgi");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b krastines ilgi");
        double b = scanner.nextDouble();
        return (a*b);
    }
    private double kvadratoPlotas(Scanner scanner){
        System.out.println("Iveskite kvadrato krastines ilgi");
        double a = scanner.nextDouble();
        return  a*a;
    }
    private double apskritimoPlotas(Scanner scanner){
        System.out.println("spindulio ilgi");
        double a = scanner.nextDouble();
        return Math.PI*Math.pow(a, 2);//3.1415*(a*a);
    }
}
