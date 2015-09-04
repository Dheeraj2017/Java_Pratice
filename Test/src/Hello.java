/*
 1)class keyword is used to declare a class in java.
 2) public keyword is an access modifier which represents visibility, it means it is visible to all.
 3) static is a keyword, if we declare any method as static, it is known as static method. 
    The core advantage of static method is that there is no need to create object to invoke the static method.
    The main method is executed by the JVM, so it doesn't require to create object to invoke the main method.
     So it saves memory.
   4) void is the return type of the method, it means it doesn't return any value. 
   5)main represents startup of the program.
   6) String[] args is used for command line argument. We will learn it later.
   7) System.out.println() is used print statement. We will learn about the internal working 
   of System.out.println statement later.
 */



public class Hello {
	
	
	public static void main(String args[]){
		System.out.println("Hello");
	}
	
}
/*
How many ways can we write a java program

There are many ways to write a java program. The modifications that can be done in a java program are given below:

1) By changing sequence of the modifiers, method prototype is not changed.

Let's see the simple code of main method.

              static public void main(String args[])  

2) subscript notation in java array can be used after type, before variable or after variable.

Let's see the different codes to write the main method.

         public static void main(String[] args)  
         public static void main(String []args)  
         public static void main(String args[])  
3) You can provide var-args support to main method by passing 3 ellipses (dots)

Let's see the simple code of using var-args in main method. We will learn about var-args later in Java New Features chapter.

public static void main(String... args)
*/

/*
  4) Having semicolon at the end of class in java is optional.

Let's see the simple code.

class A{  
static public void main(String... args){  
System.out.println("hello java4");  
}  
};  

 */


/*Valid java main method signature

public static void main(String[] args)  
public static void main(String []args)  
public static void main(String args[])  
public static void main(String... args)  
static public void main(String[] args)  
public static final void main(String[] args)  
final public static void main(String[] args)  
final strictfp public static void main(String[] args)  




         Invalid java main method signature

public void main(String[] args)  
static void main(String[] args)  
public void static main(String[] args)  
abstract public static void main(String[] args)  
*/