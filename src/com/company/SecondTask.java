package com.company;

public class SecondTask {
    public static void main(String[] args) {
        String palindrome = "KOL EINU ŠUNIE LOK".replaceAll(" ", "");

        if(isPalindrome(palindrome)) {
            System.out.println("Polindromas");
        }else{
            System.out.println("Nepolindromas");
        }

    }

    private static boolean isPalindrome(String palindrome){
        boolean result = true;
        for(int i = 0; i < palindrome.length(); i++){
            char a = palindrome.charAt(i);
            char b = palindrome.charAt(palindrome.length() - i - 1);
            if(a != b) {
                result = false;
                break;
            }
        }
        return result;
    }
}
