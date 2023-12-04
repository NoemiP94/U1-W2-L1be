package es2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        try{
            log.info("Inserisci il numero di km percorsi: ");
            double kmPercorsi = Double.parseDouble(scanner.nextLine());

            log.info("Inserisci i litri di carburante che sono stati consumati: ");
            double lConsumati = Double.parseDouble(scanner.nextLine());

            if(lConsumati != 0){
                double consumoKmLitro = kmPercorsi / lConsumati;
                log.info("Il consumo di quest'auto è " + consumoKmLitro + " km/litro");
            }else{
                log.error("Errore! I litri consumati non possono essere 0!");
            }
        }catch (ArithmeticException ex ){
            log.error("Errore! Non si può dividere per 0!");
        }finally{
            scanner.close();
        }
    }
}
