/*  3) super can be used to invoke parent class method.

The super keyword can also be used to invoke parent class method. It should be used in case subclass contains the same method as parent class as in the example given below:

	*/
	class Person{  
void message(){System.out.println("welcome");}  
}  
  
public class Student extends Person{  
void message(){System.out.println("welcome to java");}  
  
void display(){  
message();//will invoke current class message() method  
super.message();//will invoke parent class message() method  
}  
  
public static void main(String args[]){  
Student s=new Student();  
s.display();  
}  
}
/*In the above example Student and Person both classes have message() method
 if we call message() method from Student class, it will call the message() method of Student class
 not of Person class because priority is given to local.

In case there is no method in subclass as parent, there is no need to use super. 
In the example given below message() method is invoked from Student class
 but Student class does not have message() method, so you can directly call message() method.
*/
