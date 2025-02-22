public class LocalVariableExample {
    public void printNumber() {
        int number = 10; // Local variable
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        LocalVariableExample obj = new LocalVariableExample();
        obj.printNumber();
    }
}