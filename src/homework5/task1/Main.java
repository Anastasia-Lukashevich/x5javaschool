package homework5.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoggerFactory factory = new FileLoggerFactory();
        Calculator calc = new Calculator(factory.createLogger());
        System.out.println("Введите первый операнд: ");
        int x = scanner.nextInt();
        System.out.println("Введите второй операнд: ");
        int y = scanner.nextInt();
        System.out.println("Введите операцию (+,-,*,/): ");
        String operator = scanner.next();
        switch (operator) {
            case "+" -> calc.addition(x, y);
            case "-" -> calc.subtraction(x, y);
            case "*" -> calc.multiplication(x, y);
            case "/" -> calc.division(x, y);
            default -> System.out.println("Введена некорректная операция!");
        }
    }
}
