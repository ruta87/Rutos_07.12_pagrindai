package com.company;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Iveskite zodi");
        String word = scanner.nextLine();

        System.out.println(word);*/
        getCorrectWord(scanner);
    }


    private static void getCorrectWord(Scanner sc) {
        String word;
        do {
            System.out.println("Iveskite zodi");
            word = sc.nextLine().toLowerCase();
            printWord(word);
        } while (!word.equals("pabaiga"));
    }

    private static void printWord(String word) {
        int count = countLetter(word, 'a');
        if (word.length() % 2 == 0) {
            System.out.println("Ivestas zodis " + word + " lyginis, jo ilgis " + word.length() + " a raidziu " + count);
        } else {
            System.out.println(" Ivestas zodis " + word + " nelyginis, jo ilgis " + word.length() + " a raidziu " + count);
        }
    }

    private static int countLetter(String word, char letter) {
        int result = 0;
        for (int i = 0; i < word.length(); i++){
            char temp = word.charAt(i);
            if(letter == temp){
                result++;
            }
        }
        return result;
    }

}