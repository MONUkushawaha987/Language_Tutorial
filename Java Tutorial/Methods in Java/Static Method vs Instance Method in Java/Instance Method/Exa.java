// Demonstrating the in use of instance method
import java.io.*;

class Test {
    String n = "";

    // Instance method 
    public void test(String n) { 
      this.n = n; 
    }
}

class Exa {
    public static void main(String[] args) {

        // create an instance of the class
        Test t = new Test();

        // calling an instance method 
        // in the class 'Exa'
        t.test("Hello There !");
        System.out.println(t.n);
    }
}
