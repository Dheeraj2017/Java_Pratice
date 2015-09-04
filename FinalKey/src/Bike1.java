/*2) final method

If you make any method as final, you cannot override it.

Example of final method
  */
public class Bike1{  
  final void run(){System.out.println("running");}  
}  
     
class Honda extends Bike1{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
}  

//this prog. give compile time error



/*
            Q) What is blank or uninitialized final variable?

   ans= A final variable that is not initialized at the time of declaration is known as blank final variable.

     If you want to create a variable that is initialized at the time of creating object and 
     once initialized may not be changed, it is useful. For example PAN CARD number of an employee.

              It can be initialized only in constructor.

//Example of blank final variable

class Student{  
int id;  
String name;  
final String PAN_CARD_NUMBER;  
...  
} 

 
 */

/*
          Que) Can we initialize blank final variable?

   ans= Yes, but only in constructor. For example:

class Bike{  
  final int speedlimit;//blank final variable  
    
  Bike(){  
  speedlimit=70;  
  System.out.println(speedlimit);  
  }  
  
  public static void main(String args[]){  
    new Bike();  
 }  
}  
Output:70
*/

/*
static blank final variable

A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.

Example of static blank final variable

class A{  
  static final int data;//static blank final variable  
  static{ data=50;}  
  public static void main(String args[]){  
    System.out.println(A.data);  
 }  
}  
*/

/*              Q) What is final parameter?

       ans=If you declare any parameter as final, you cannot change the value of it.

                class Bike{  
              int cube(final int n){  
                  n=n+2;//can't be changed as n is final  
          n*n*n;  
               }  
              public static void main(String args[]){  
                        Bike b=new Bike();  
                    b.cube(5);  
              }  
       }  


Output:Compile Time Error

*/

/*
                   Q) Can we declare a constructor final?

   ans=  No, because constructor is never inherited.

*/
