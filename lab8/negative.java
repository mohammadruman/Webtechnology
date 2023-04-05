import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        try {
            ProcessInput(number);
        } catch (NegativeNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void ProcessInput(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        } else {
            System.out.println("Double value of entered number is: " + number * 2);
        }
    }
}
