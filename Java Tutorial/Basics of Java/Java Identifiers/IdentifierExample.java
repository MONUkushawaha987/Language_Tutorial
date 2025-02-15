public class IdentifierExample {
    public static void main(String[] args) {
        // Valid identifiers
        int age = 25;
        String firstName = "John";
        double _salary = 50000.50;
        String $currency = "USD";

        // Invalid identifiers (commented out to avoid compilation errors)
        // int 2ndPlace = 2; // Error: Cannot start with a digit
        // String first-name = "Jane"; // Error: Hyphen is not allowed
        // double public = 100.0; // Error: 'public' is a keyword

        // Printing valid identifiers
        System.out.println("Age: " + age);
        System.out.println("First Name: " + firstName);
        System.out.println("Salary: " + _salary);
        System.out.println("Currency: " + $currency);
    }
}