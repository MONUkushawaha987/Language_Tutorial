class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ClassExample {
    public static void main(String[] args) {
        Person person = new Person("John", 25); // Object of Person class
        person.display();
    }
}