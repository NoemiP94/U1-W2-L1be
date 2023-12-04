package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Inserisci il numero di km percorsi: ");
            double kmPercorsi = Double.parseDouble(scanner.nextLine());

            System.out.println("Inserisci i litri di carburante che sono stati consumati: ");
            double lConsumati = Double.parseDouble(scanner.nextLine());

            if(lConsumati != 0){
                double consumoKmLitro = kmPercorsi / lConsumati;
                System.out.println("Il consumo di quest'auto è " + consumoKmLitro + " km/litro");
            }else{
                System.out.println("Errore! I litri consumati non possono essere 0!");
            }
        }catch (ArithmeticException ex ){
            System.out.println("Errore! Non si può dividere per 0!");
        }finally{
            scanner.close();
        }
    }
}
