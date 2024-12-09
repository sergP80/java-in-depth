package ua.edu.chmnu.advanced_java.exception;

public class RecursionInfinite {

    static class NegativeSumException extends RuntimeException {

        public NegativeSumException() {
        }

        public NegativeSumException(String message) {
            super(message);
        }
    }

    static int sum(int n) throws NegativeSumException {
        if (n < 0) {
            throw new NegativeSumException("Illegal negative number: " + n);
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        try {
            var result = sum(-100);

            System.out.println(result);
        } catch (NegativeSumException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }


        //RuntimeException e = new RuntimeException();
        //Error
        //Exception
        //Throwable

        //IOException
        //FileNotFoundException
    }
}
