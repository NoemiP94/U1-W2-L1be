package es1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];
        Random rndm = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = rndm.nextInt(10) + 1;
        }

        System.out.println("Questo è l'array iniziale: ");
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);
        int valoreInserito;


            try{
                System.out.println("Inserire un numero da 1 a 10 (0 per uscire dal programma)");
                valoreInserito = Integer.parseInt(scanner.nextLine());

                if( valoreInserito != 0){
                    System.out.println("In che posizione da 1 a 5 vuoi inserire il numero?");
                    int posizione = Integer.parseInt(scanner.nextLine());

                    if(posizione >= 1 && posizione <= array.length){
                        array[posizione - 1 ] = valoreInserito;

                        System.out.println("Questo è l'array aggiornato: ");
                        stampaArray(array);
                    }else{
                        System.out.println("Errore! Posizione non disponibile!");
                    }
                }
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Errore! Inserisci una posizione valida!");
            }

        scanner.close();

    }

    private static void stampaArray(int[] array){
        for(int i : array){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}