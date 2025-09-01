package basic;
import java.util.Scanner;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ("AEIOU aeiou".indexOf(ch) != -1)
            System.out.println(ch + " is a vowel.");
        else
            System.out.println(ch + " is a consonant.");
    }
}