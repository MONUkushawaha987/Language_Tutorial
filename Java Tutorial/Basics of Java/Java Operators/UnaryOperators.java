public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a++: " + (a++)); // 10 (post-increment)
        System.out.println("++a: " + (++a)); // 12 (pre-increment)
        System.out.println("a--: " + (a--)); // 12 (post-decrement)
        System.out.println("--a: " + (--a)); // 10 (pre-decrement)
    }
}