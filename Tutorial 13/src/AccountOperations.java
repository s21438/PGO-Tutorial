

public interface AccountOperations {

    double checkBalance();
    void transfer() throws AccountOperationException;
    void pay() throws AccountOperationException;
}