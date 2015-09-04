//      Inheritance in Java

/*Inheritance
                  Types of Inheritance
ques=)     Why multiple inheritance is not possible in java in case of class?
ans=>  Inheritance is a mechanism in which one object acquires all the properties and behaviours of parent object.
*/
/*The idea behind inheritance is that you can create new classes that are built upon existing classes. 
 When you inherit from an existing class, you reuse (or inherit) methods and fields, 
 and you add new methods and fields to adapt your new class to new situations.
 

Inheritance represents the IS-A relationship.
*/
                  /*   ques=>Why use Inheritance?

ans=?     1) For Method Overriding (So Runtime Polymorphism).
          2) For Code Reusability.

*/

//Syntax of Inheritance
/*
class Subclass-name extends Superclass-name  
{  
   //methods and fields  
} */ 
/*The keyword extends indicates that you are making a new class that derives from an existing class.
  In the terminology of Java, a class that is inherited is called a superclass. The new class is called a subclass
 
*/


class Employee{  
 float salary=40000;  
}  
  
public class Inheritance extends Employee{  
 int bonus=10000;  
    
 public static void main(String args[]){  
   Inheritance p=new Inheritance();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  
