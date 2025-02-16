// Program to demonstrate the 'this' keyword
class ThisExample {
    int number;

    ThisExample(int number) {
        this.number = number; // 'this' refers to the current object
    }

    void display() {
        System.out.println("Number: " + this.number);
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample(10);
        obj.display();
    }
}


