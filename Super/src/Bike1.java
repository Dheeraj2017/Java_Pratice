  /*2) super is used to invoke parent class constructor.

The super keyword can also be used to invoke the parent class constructor as given below:
*/
	
	 class Vehicle1{  
  Vehicle1(){System.out.println("Vehicle is created");}  
}  
  
public class Bike1 extends Vehicle1{  
  Bike1(){  
   super();//will invoke parent class constructor  
   System.out.println("Bike is created");  
  }  
  public static void main(String args[]){  
   Bike1 b=new Bike1();  
        
}  
}  
/*
super() is added in each class constructor automatically by compiler.

super keyword
As we know well that default constructor is provided by compiler automatically
 but it also adds super() for the first statement.
 If you are creating your own constructor and you don't have either this() or super() as the first statement,
  compiler will provide super() as the first statement of the constructor.
 */
