                                      //Aggregation in Java//

/*If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

Consider a situation, Employee object contains many informations such as id, name, emailId etc.
 It contains one more object named address,
 which contains its own informations such as city, state, country, zipcode etc. as given below.
*/
/*
class Employee{  
int id;  
String name;  
Address address;//Address is a class  
...  
} */ 


//In such case, Employee has an entity reference address, so relationship is Employee HAS-A address.
/*
                             ques:-Why use Aggregation?
ans=>
1) For Code Reusability.
*/

/*
Simple Example of Aggregation

aggregation example
In this example, we have created the reference of Operation class in the Circle class.
*/

class Operation{  
 int square(int n){  
  return n*n;  
 }  
}  
  
public class Aggregation{  
 Operation op;//aggregation  
 double pi=3.14;  
    
 double area(int radius){  
   op=new Operation();  
   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
   return pi*rsquare;  
 }  
  
     
    
 public static void main(String args[]){  
   Aggregation c=new Aggregation();  
   double result=c.area(5);  
   System.out.println(result);  
 }  
}

/*           ques=>When use Aggregation?

ans=> 1) Code reuse is also best achieved by aggregation when there is no is-a relationship.
2) Inheritance should be used only if the relationship is-a is maintained throughout
   the lifetime of the objects involved; otherwise, aggregation is the best choice.
*/
