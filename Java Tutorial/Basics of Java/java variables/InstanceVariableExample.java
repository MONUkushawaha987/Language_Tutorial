public class InstanceVariableExample {
    int number = 20; // Instance variable

    public void printNumber() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        InstanceVariableExample obj = new InstanceVariableExample();
        obj.printNumber();
    }
}