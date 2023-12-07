package org.lessons.java.wishlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CREAZIONE PROVA REGALI
/*
        List firstGift = new List("Libro");
        List secondGift = new List("Computer");
        List thirdGift = new List("Bicicletta");


    // CREAZIONE SET

        Set<List> miaLista = new HashSet<>();

        // AGGIUNTA ELEMENTI SET
        miaLista.add(firstGift);
        miaLista.add(secondGift);
        miaLista.add(thirdGift);

        System.out.println("Contenuto del set: " + miaLista);
 */

        ArrayList<String> listaRegali = new ArrayList<>();

        boolean continua = true;

        while(continua){
            System.out.println("Inserisci il regalo");
            String regalo = scanner.nextLine();

            if (!listaRegali.contains(regalo)) {
                listaRegali.add(regalo);
                System.out.println("Regalo aggiunto!");
            } else {
                System.out.println("Il regalo è già presente nella lista. Non verrà aggiunto.");
            }

            System.out.println("La grandezza della lista é: " + listaRegali.size());
            System.out.println("La lista è: " + listaRegali);


            System.out.println("Vuoi inserire altri regali? (y/n)");
            String continuaRisposta = scanner.nextLine();
            if (!continuaRisposta.equalsIgnoreCase("y")) {
                continua = false;
                System.out.println("Ok, la lista completa dei regali è: " + listaRegali);
            }
        }








    scanner.close();
    }
    }

