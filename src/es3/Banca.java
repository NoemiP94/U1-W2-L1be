package es3;

import es3.exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banca {
    private static final Logger log = LoggerFactory.getLogger(Banca.class);
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try{
            conto1.preleva(1750.5);
            log.info("Saldo conto: " + conto1.restituisciSaldo());
        }catch(BancaException e){
            log.error("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }

        ContoOnline conto2 = new ContoOnline("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();

        try{
            conto2.preleva(2000);
            conto2.stampaSaldo();
        }catch(BancaException e ){
            log.error("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }
    }
}
