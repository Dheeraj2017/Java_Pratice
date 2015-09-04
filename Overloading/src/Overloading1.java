
public class Overloading1{  
	  
Overloading1(){System.out.println("Bike is created");}  
  
public static void main(String args[]){  
Overloading1 b=new Overloading1();  
}  
}  
/*Rule: If there is no constructor in a class, compiler automatically creates a default constructor.*/
/*
What is the difference between constructor and method ?

There are many differences between constructors and methods. They are given below.

                 CONSTRUCTOR	   
 1) Constructor is used to initialize the state of an object.
 2) Constructor must not have return type.	                             
 3) Constructor is invoked implicitly.	                                               
 4) The java compiler provides a default constructor if you don't have any constructor.
 5) Constructor name must be same as the class name.

                 METHOD
   1) Method is used to expose behavior of an object.
   2) Method must have return type.
   3) Method is invoked explicitly.
   4) Method is not provided by compiler in any case.
   5) Method name may or may not be same as class name.
*/
