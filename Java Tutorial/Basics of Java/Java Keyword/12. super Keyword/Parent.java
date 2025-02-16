// Program to demonstrate the 'super' keyword
class Parent {
    void display() {
        System.out.println("Parent class method.");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calls the parent class method
        System.out.println("Child class method.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}


