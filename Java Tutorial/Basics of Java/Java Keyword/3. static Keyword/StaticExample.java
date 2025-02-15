// Program to demonstrate the 'static' keyword
class StaticExample {
    static int count = 0; // Static variable

    static void increment() { // Static method
        count++;
    }

    public static void main(String[] args) {
        increment();
        System.out.println("Count: " + count);
    }
}