package es3.exceptions;

public class BancaException extends Exception{
    String message;

    public BancaException(String message){
        super(message);
        this.message = message;
    }
}
