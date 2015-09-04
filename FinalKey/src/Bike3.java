/*3) final class

If you make any class as final, you cannot extend it.

Example of final class
*/
final class Bike3{
	
	
}  
  
class Honda2 extends Bike3{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
  Honda2 honda= new Honda2();  
  honda.run();  
  }  
}  


//this prog. give the compile time error

