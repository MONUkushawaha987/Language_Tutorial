// Java Program to call Static Methods
import java.io.*;

class test {
  
    // Static method
    static void hello()
    {
        System.out.println("Hello");
    }
}

class Example {

    public static void main(String[] args) {
      
        // calling the Method 1
        // Accessing method
        test.hello();
    }
}
