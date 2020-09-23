package homework7;

import homework7.exceptions.NotEnoughMoneyException;
import homework7.exceptions.UnknownAccountException;

import java.io.*;

public class FileAccountService implements AccountService {

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account account = getAccount(accountId);
        account.withdraw(amount);
        saveAccount(account);
        System.out.println("Указанная сумма списана со счета.");
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        Account account = getAccount(accountId);
        System.out.println("Сумма на счете " + account.getAmount());
    }

    @Override
    public void deposit(int accountId, int amount) throws UnknownAccountException {
        Account account = getAccount(accountId);
        account.deposit(amount);
        saveAccount(account);
        System.out.println("Указанная сумма зачислена на счет.");
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account accountFrom = getAccount(from);
        Account accountTo = getAccount(to);
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
        saveAccount(accountFrom);
        saveAccount(accountTo);
        System.out.println("Указанная сумма успешно переведена.");
    }

    private Account getAccount(int accountId) throws UnknownAccountException {
        try (BufferedReader reader = new BufferedReader(new FileReader("accounts/" + accountId + ".txt"))) {
            String holder = reader.readLine();
            int amount = Integer.parseInt(reader.readLine());
            return new Account(accountId, holder, amount);
        } catch (FileNotFoundException e) {
            throw new UnknownAccountException();
        } catch (IOException e) {
            throw new RuntimeException("File work error.");
        }
    }

    private void saveAccount(Account account) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("accounts/" + account.getId() + ".txt"))) {
            writer.println(account.getHolder());
            writer.println(account.getAmount());
        } catch (IOException e) {
            throw new RuntimeException("File work error.");
        }
    }
}
