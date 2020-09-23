package homework7;

import homework7.exceptions.NotEnoughMoneyException;
import homework7.exceptions.UnknownAccountException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, UnknownAccountException, NotEnoughMoneyException {
        checkFile();
        Scanner scanner = new Scanner(System.in);
        FileAccountService fileAccountService = new FileAccountService();
        while (true) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "balance" -> fileAccountService.balance(Integer.parseInt(command[1]));
                case "withdraw" -> fileAccountService.withdraw(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                case "deposite" -> fileAccountService.deposit(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                case "transfer" -> fileAccountService.transfer(Integer.parseInt(command[1]), Integer.parseInt(command[2]), Integer.parseInt(command[3]));
                case "exit" -> System.exit(0);
                default -> System.out.println("Неверная команда. Если хотите выйти, введите exit.");
            }
        }

    }

    public static void checkFile() throws IOException {
        if (!Files.exists(Path.of("accounts"))) {
            Files.createDirectory(Path.of("accounts"));
            for (int i = 1; i <= 10; i++) {
                try (PrintWriter writer = new PrintWriter(new FileWriter("accounts/" + i + ".txt"))) {
                    writer.println("Holder " + i);
                    writer.println((int) (Math.random() * 100));
                }
            }
        }
    }
}
