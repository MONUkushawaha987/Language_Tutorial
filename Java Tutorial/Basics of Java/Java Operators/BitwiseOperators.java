public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 3; // 5 = 0101, 3 = 0011 in binary
        System.out.println("a & b: " + (a & b)); // 1 (AND)
        System.out.println("a | b: " + (a | b)); // 7 (OR)
        System.out.println("a ^ b: " + (a ^ b)); // 6 (XOR)
        System.out.println("~a: " + (~a));      // -6 (NOT)
        System.out.println("a << 1: " + (a << 1)); // 10 (Left Shift)
        System.out.println("a >> 1: " + (a >> 1)); // 2 (Right Shift)
    }
}