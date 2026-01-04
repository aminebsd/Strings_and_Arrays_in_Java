package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text (max. 100 characters): ");
        String input = scanner.nextLine();

        int[] nb_occurrences = new int[26];
        input = input.toUpperCase();


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                nb_occurrences[c - 'A']++;
            }
        }

        System.out.println("The string " + input + "contain : " );

        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                char letter = (char) ('A' + i);
                int count = nb_occurrences[i];

                System.out.println(count  + " occurence  of the letter '" + letter );
            }
        }

        scanner.close();

    }
}