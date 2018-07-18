package ListSetMap;

import java.util.Scanner;

public class Nauji0718a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite savaites dienos nr. 1,2,3,4,5,6,7");
        int day = scanner.nextInt();
        Week week = Week.getDayById(day);

        System.out.println(week.name());
    }
}
