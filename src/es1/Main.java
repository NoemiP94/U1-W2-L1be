package es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        int[] array = new int[5];
        Random rndm = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = rndm.nextInt(10) + 1;
        }

        log.info("Questo è l'array iniziale: ");
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);
        int valoreInserito;


            try{
                log.info("Inserire un numero da 1 a 10 (0 per uscire dal programma)");
                valoreInserito = Integer.parseInt(scanner.nextLine());

                if( valoreInserito != 0){
                    log.info("In che posizione da 1 a 5 vuoi inserire il numero?");
                    int posizione = Integer.parseInt(scanner.nextLine());

                    if(posizione >= 1 && posizione <= array.length){
                        array[posizione - 1 ] = valoreInserito;

                        log.info("Questo è l'array aggiornato: ");
                        stampaArray(array);
                    }else{
                        log.error("Errore! Posizione non disponibile!");
                    }
                }
            }catch (ArrayIndexOutOfBoundsException ex){
                log.error("Errore! Inserisci una posizione valida!");
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