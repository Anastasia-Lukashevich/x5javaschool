package homework7.exceptions;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException() {
        super();
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
