// Demonstration of the static method  
import java.io.*;

class Exa {
  
  // static method 
  public static void greet(){
    
    System.out.println("Hello Geek!");
  }
    public static void main (String[] args) {
      
       // calling the method directily
       greet();
      
        // calling the method 
        // using the class name
        Exa.greet();  
    }
}
