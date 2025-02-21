interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Object of Dog class using Animal interface
        myAnimal.sound();
    }
}