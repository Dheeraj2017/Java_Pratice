/*    super keyword==>>The super is a reference variable that is used to refer immediate parent class object.

Whenever you create the instance of subclass, an instance of parent class is created implicitly i.e. referred by super reference variable.

     :-Usage of super Keyword

a)super is used to refer immediate parent class instance variable.
b)super() is used to invoke immediate parent class constructor.
c)super is used to invoke immediate parent class method.
1) super is used to refer immediate parent class instance variable.

Problem without super keyword

*/
/*class Vehicle{  
  int speed=50;  
}  
  
class Bike extends Vehicle{  
  int speed=100;  
      
  void display(){  
   System.out.println(speed);//will print speed of Bike   
  }  
  public static void main(String args[]){  
   Bike b=new Bike();  
   b.display();  
     
}  
}*/
/*
//explanation:
In the above example Vehicle and Bike both class have a common property speed.
Instance variable of current class is refered by instance bydefault, 
but I have to refer parent class instance variable that is why we use super keyword to distinguish
 between parent class instance variable and current class instance variable. 
*/	

//example of super keyword  

class Vehicle{  
int speed=50;  
}  

class Bike extends Vehicle{  
int speed=100;  
    
void display(){  
 System.out.println(super.speed);//will print speed of Vehicle now  
}  
public static void main(String args[]){  
 Bike b=new Bike();  
 b.display();  
   
}  
}
