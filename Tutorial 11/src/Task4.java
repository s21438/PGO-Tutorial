import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<>(10);

    public int readNumber() throws NegativeNumberException {
        int input = scanner.nextInt();
        if (input < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return input;
    }

    public void fillArray() {

        for (int i = 0; i < list.size(); i++) {
            try {
                list.set(i, readNumber());
            } catch (NegativeNumberException e) {
                list.set(i, 0);
                System.out.println(e.getMessage());
            }
        }
    }



}
