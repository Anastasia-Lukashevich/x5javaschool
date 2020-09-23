package homework7.exceptions;

public class UnknownAccountException extends Exception {
    public UnknownAccountException() {
        super();
    }

    public UnknownAccountException(String message) {
        super(message);
    }
}
