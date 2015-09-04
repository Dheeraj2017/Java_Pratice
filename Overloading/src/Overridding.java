//Method Overriding in Java
/*
   Understanding problem without method overriding
   Can we override the static method??*/

//     method overriding
/*If subclass (child class) has the same method as declared in the parent class, it is known as method overriding.

In other words, If subclass provides the specific implementation of the method that 
has been provided by one of its parent class, it is known as Method Overriding.
*/


//         Advantage of Java Method Overriding
/*
    1) Method Overriding is used to provide specific implementation of a method
     that is already provided by its super class.
    2)Method Overriding is used for Runtime Polymorphism
*/
      

//Rules for Method Overriding
/*
1)method must have same name as in the parent class
2)method must have same parameter as in the parent class.
3)must be IS-A relationship (inheritance).

*/
//Understanding the problem without method overriding

//Let's understand the problem that we may face in the program if we don't use method overriding.

  class Vehicle{  
  void run(){System.out.println("Vehicle is running");}  
  }  
  public class Overridding extends Vehicle{  
    
  public static void main(String args[]){  
  Overridding obj = new Overridding();  
  obj.run();  
  }  
}
