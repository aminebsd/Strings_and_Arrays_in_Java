package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String flag = "true";
        String input = "";
        while(!flag.equals("q")){
            System.out.println(" ****************** Welcome ********************");

            System.out.println("1. Enter: read a character string from the keyboard. ");
            System.out.println("2. Display: display the entered string.");
            System.out.println("3. Reverse: reverse the entered string.");
            System.out.println("4. Number of words: count");

            System.out.println("*********************************************** ");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1 :
                    System.out.println("Enter a string: ");
                    input = scanner.nextLine();

                    break;
                case 2 :
                    System.out.println(input);
                    break;
                case 3 :
                    String rev = "";
                    for(int i = input.length()-1; i >= 0; i--){
                        rev = rev + input.charAt(i);
                    }
                    System.out.println(rev);
                    break;
                case 4 :
                    System.out.println(input.length());
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }

            System.out.println("Press any key to return to the menu.");
            System.out.println(" Press 'q' to quit ");
            flag = scanner.nextLine();
        }
    }
}