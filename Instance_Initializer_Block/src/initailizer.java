/* //      Rules for instance initializer block :

        There are mainly three rules for the instance initializer block. They are as follows:
1)The instance initializer block is created when instance of the class is created.
2)The instance initializer block is invoked after the parent class constructor
  is invoked (i.e. after super() constructor call).
3)The instance initializer block comes in the order in which they appear.
//Program of instance initializer block that is invoked after super()
*/
class A{  
A(){  
System.out.println("parent class constructor invoked");  
}  
}  
public class initailizer extends A{  
initailizer(){  
super();  
System.out.println("child class constructor invoked");  
}  
  
{System.out.println("instance initializer block is invoked");}  
  
public static void main(String args[]){  
initailizer b=new initailizer();  
}  
}
