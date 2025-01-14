package exception;

public class ArithmeticException{
    public static void main(String[] args) {
        int n = 0;
        try {
            n = 2 / 0;
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(n);
    }
}
