public class LoopControlExample {
    public static void main(String[] args) {
        // Print numbers from 1 to 10, but skip 5 and stop at 8
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip 5
            }
            if (i == 9) {
                break; // Stop at 8
            }
            System.out.println("Number: " + i);
        }
    }
}