//real time example of method overriding

class Bank{  
int getRateOfInterest(){return 0;}  
}  
  
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
  
public class Overriding2{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}
/*
     ques=>  What is the difference between method Overloading and Method Overriding?

ans=> There are three basic differences between the method overloading and method overriding. They are as follows:

                     Method Overloading	
     1) Method overloading is used to increase the readability of the program.	
     2) method overloading is performed within a class.	
     3) In case of method overloading parameter must be different.
     
                      
                      Method Overriding
        1)Method overriding is used to provide the specific implementation of the method that
         is already provided by its super class.
        2)Method overriding occurs in two classes that have IS-A relationship.
        3)	In case of method overriding parameter must be same.


*/