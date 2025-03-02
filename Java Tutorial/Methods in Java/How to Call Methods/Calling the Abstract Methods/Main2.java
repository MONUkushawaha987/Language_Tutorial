// Java Program to call Abstract Method Helper class acting  as Abstract class
abstract class Main2help {

    // Creating abstract method
    abstract void check(String n);
}

// Main class extending to helper class
public class Main2 extends Main2help {

    public static void main(String[] args) {
      
        // Creating the instance of the class
        Main2 ob = new Main2();

        // Accessing the abstract method
        ob.check("Main2");
    }

    // Extends the abstract method
    @Override void check(String n)
    {
        System.out.println(n);
    }
}
