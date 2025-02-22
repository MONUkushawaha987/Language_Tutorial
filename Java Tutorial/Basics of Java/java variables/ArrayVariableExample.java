public class ArrayVariableExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5}; // Array variable
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }

    public static void main(String[] args) {
        ArrayVariableExample obj = new ArrayVariableExample();
        obj.printNumbers();
    }
}