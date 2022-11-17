package cl.bci.palma.domain.exceptions;

public class ValueInUseException extends RuntimeException {
    public ValueInUseException(String message){
        super(message);
    }

    public ValueInUseException(String message, Throwable throwable){
        super(message, throwable);
    }
}
