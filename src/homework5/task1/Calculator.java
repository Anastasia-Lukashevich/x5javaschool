package homework5.task1;

public class Calculator {
    private final Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public int addition(int x, int y) {
        int result = x + y;
        logger.log(String.valueOf(result));
        return result;
    }

    public int subtraction(int x, int y) {
        int result = x - y;
        logger.log(String.valueOf(result));
        return result;
    }

    public int multiplication(int x, int y) {
        int result = x * y;
        logger.log(String.valueOf(result));
        return result;
    }

    public double division(int x, int y) {
        double result = (double) x / y;
        logger.log(String.valueOf(result));
        return result;
    }
}
