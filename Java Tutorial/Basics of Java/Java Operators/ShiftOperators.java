public class ShiftOperators {
    public static void main(String[] args) {
        int a = 8; // 8 = 1000 in binary
        System.out.println("a << 1: " + (a << 1)); // 16 (Left Shift)
        System.out.println("a >> 1: " + (a >> 1)); // 4 (Right Shift)
        System.out.println("a >>> 1: " + (a >>> 1)); // 4 (Unsigned Right Shift)
    }
}