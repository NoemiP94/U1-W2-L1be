package es3;

import es3.exceptions.BancaException;

public class ContoCorrente {

    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    public ContoCorrente(String titolare, double saldo){
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;
        } else {
            saldo = saldo - x - 0.50;
            nMovimenti++;
            if (this.saldo <= 0) throw new BancaException("Il conto è in rosso!");
        }
    }

    public double restituisciSaldo(){
        return saldo;
    }
}
