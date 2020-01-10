package Exceptions;

public class WrongNameException extends IllegalArgumentException {
    public WrongNameException(String message){
        super(message);
    }
}
