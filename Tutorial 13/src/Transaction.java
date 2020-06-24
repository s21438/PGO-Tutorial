

public class Transaction {

    private double amount;
    private BankAccount sender, receiver;

    public Transaction(double amount, BankAccount sender, BankAccount receiver){
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return amount + " from " + sender + " to " + receiver;
    }
}
