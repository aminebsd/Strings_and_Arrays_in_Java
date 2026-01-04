package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Float> grade_list = new ArrayList<Float>();
        boolean flag = true;

        while (flag) {
            System.out.println("");
            System.out.println("");
            System.out.println(" 0- Quite the menu : ");
            System.out.println(" 1- Add new Student Grade : ");
            System.out.println(" 2- display sorted grade list : ");
            System.out.println(" 3- Display the average grade : ");
            System.out.println(" 4- Display the highest and lowest grades : ");
            System.out.println(" 5- Display the number of students with a grade entered by the user : ");

            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Enter grade : ");
                    float grade = scanner.nextFloat();
                    grade_list.add(grade);
                    break;

                case 2 :
                    grade_list.sort(null);
                    System.out.println(grade_list);
                    break;

                case 3 :
                    float somme = 0;
                    float average = 0;
                    for(float g:grade_list){
                        somme += g ;
                        average = somme /  grade_list.size();
                    }
                    System.out.println(average);
                    break;

                case 4 :
                    float min = grade_list.get(0);
                    float max = grade_list.get(0);
                    for (float g:grade_list){
                        if (g < min){
                            min = g;
                        }
                        else if (g > max){
                            max = g;
                        }
                    }
                    System.out.println("the minimum grade is : " + min);
                    System.out.println("the maximum grade is : " + max);
                    break;

                case 5 :
                    System.out.println("total student number entered : " + grade_list.size());
                    break;
                case 0 :
                    flag = false;
                    System.out.println("Good Bye!");
                    break;

                default :
                    System.out.println("Wrong choice : Enter a valid choice  ");

            }
        }
    }
}