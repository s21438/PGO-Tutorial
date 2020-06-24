

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount implements AccountOperations {

    private double balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(){
        balance = 0;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void transfer() throws AccountOperationException {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        if(money<0 || money<balance){
            throw new AccountOperationException();
        }
        balance = balance-money;
    }

    @Override
    public void pay() throws AccountOperationException {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        if(money<0 || money<balance){
            throw new AccountOperationException();
        }
        balance = balance-money;
    }
}