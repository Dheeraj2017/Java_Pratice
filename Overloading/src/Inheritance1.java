//Que) Why multiple inheritance is not supported in java?

//ans=>To reduce the complexity and simplify the language, multiple inheritance is not supported in java. For example:
class A{  
void msg(){System.out.println("Hello");}  
}  
  
class B{  
void msg(){System.out.println("Welcome");}  
}  
  
public class Inheritance1 extends A,B {
	//suppose if it were  
   
 public static void main(String args[]){  
	 Inheritance1 obj=new Inheritance1();  
   obj.msg();
   //Now which msg() method would be invoked?  
}  
}

