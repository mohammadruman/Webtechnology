class SuperClassException extends Exception {
    public SuperClassException(String message) {
        super(message);
    }
}

class SubClassException extends SuperClassException {
    public SubClassException(String message) {
        super(message);
    }
}

public class exception {
    public static void main(String[] args) {
        try {
            // code that may throw exceptions
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (SubClassException ex) {
            System.out.println("SubClassException caught: " + ex.getMessage());
        } catch (SuperClassException ex) {
            System.out.println("SuperClassException caught: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int num1, int num2) throws SubClassException, SuperClassException {
        int result = 0;
        try {
            result = num1 / num2;
        } catch (ArithmeticException ex) {
            throw new SubClassException("Cannot divide by zero - SubClassException");
        } catch (Exception ex) {
            throw new SuperClassException("Exception occurred - SuperClassException");
        }
        return result;
    }
}
