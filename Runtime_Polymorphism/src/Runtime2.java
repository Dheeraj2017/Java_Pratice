/*                    Runtime Polymorphism with data member

 Method is overridden not the datamembers, so runtime polymorphism can't be achieved by data members.

In the example given below, both the classes have a datamember speedlimit, 
we are accessing the datamember by the reference variable of Parent class which refers
to the subclass object. Since we are accessing the datamember which is not overridden,
 hence it will access the datamember of Parent class always.


          Rule: Runtime polymorphism can't be achieved by data members.
*/
class Bike1{  
 int speedlimit=90;  
}  
public class Runtime2 extends Bike1{  
 int speedlimit=150;  
  
 public static void main(String args[]){  
  Bike1 obj=new Runtime2();  
  System.out.println(obj.speedlimit);//90  
}
}
