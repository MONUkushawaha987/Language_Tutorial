public class StaticVariableExample {
    static int number = 30; // Static variable

    public void printNumber() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        StaticVariableExample obj = new StaticVariableExample();
        obj.printNumber();
    }
}