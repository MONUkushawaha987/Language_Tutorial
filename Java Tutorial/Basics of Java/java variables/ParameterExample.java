public class ParameterExample {
    public void printNumber(int number) { // Parameter
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        ParameterExample obj = new ParameterExample();
        obj.printNumber(40); // Passing argument
    }
}