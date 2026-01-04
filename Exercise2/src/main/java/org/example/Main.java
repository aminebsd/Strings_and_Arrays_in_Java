package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un verbe du premier groupe : ");

        String verbe = scanner.nextLine();
        verbe = verbe.trim().toLowerCase();
        if (verbe.equals("aller")){
            System.out.println("Je vais");
            System.out.println("Tu vas");
            System.out.println("Il/Elle  va");
            System.out.println("Nous allons");
            System.out.println("Vous allez");
            System.out.println("Ils/Elles vont");


        }
        else if(verbe.endsWith("er")){
            verbe = verbe.substring(0,verbe.length()-2);
            System.out.println("Je " + verbe + "e");
            System.out.println("Tu " + verbe + "es");
            System.out.println("Il/Elle " + verbe + "e");
            System.out.println("Nous " + verbe+ "ons");
            System.out.println("Vous "+ verbe + "ez" );
            System.out.println("Ils/Elles " + verbe + "ent");


        }
        else{
            System.out.println("Le verbe entré n'est pas du premier groupe");
        }
    }
}