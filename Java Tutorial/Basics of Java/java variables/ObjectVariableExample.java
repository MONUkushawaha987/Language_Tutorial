public class ObjectVariableExample {
    String name = "Java"; // Object variable (instance variable)

    public void printName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ObjectVariableExample obj = new ObjectVariableExample();
        obj.printName();
    }
}