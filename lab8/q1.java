public class q1 {
    public static void main(String[] args) {
        try {
            String s = null;
            int length = s.length();
            System.out.println("String length: \n" + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException:\n " + e.getMessage());
        }
    }
}
