// Program to demonstrate the 'final' keyword
class FinalExample {
    final int number = 10; // Final variable

    final void display() { // Final method
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.display();
    }
}


