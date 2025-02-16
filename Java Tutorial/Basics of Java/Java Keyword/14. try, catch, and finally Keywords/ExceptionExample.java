// Program to demonstrate 'try', 'catch', and 'finally' keywords
class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
    }
}


