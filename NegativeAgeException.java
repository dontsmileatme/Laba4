package Exceptions;

public class NegativeAgeException extends Exception{
    public NegativeAgeException(){
        super("Недопустимый возраст");
    }
}
