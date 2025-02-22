public class FinalVariableExample {
    final int number = 50; // Final instance variable

    public void printNumber() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.printNumber();
    }
}