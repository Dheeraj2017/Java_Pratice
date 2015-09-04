//Another example of super keyword where super() is provided by the compiler implicitly.
class Vehicle{  
	  Vehicle()
	  {System.out.println("Vehicle is created");}  
	}  
	  
	class Bike extends Vehicle{  
	  int speed;  
	  Bike(int speed){  
	    this.speed=speed;  
	    System.out.println(speed);  
	  }  
	  public static void main(String args[]){  
	   Bike b=new Bike(10);  
	 }  
	}  
	/*As we know well that default constructor is provided by compiler automatically
	   but it also adds super() for the first statement.If you are creating your own constructor
	    and you don't have either this() or super() as the first statement,
	     compiler will provide super() as the first statement of the constructor. 
	 */
	
	
