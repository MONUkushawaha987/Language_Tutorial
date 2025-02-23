class Animal {}
class Dog extends Animal {}

public class InstanceofOperator {
    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal)); // true
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));     // true
    }
}