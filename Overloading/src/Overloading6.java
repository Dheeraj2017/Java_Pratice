//  Copying the values of one object to another without constructor
/*
We can copy the values of one object into another by assigning the objects values to another object.
 In this case, there is no need to create the constructor.
*/


public class Overloading6{  
    int id;  
    String name;  
    Overloading6(int i,String n){  
    id = i;  
    name = n;  
    }  
    Overloading6(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Overloading6 s1 = new Overloading6(111,"Karan");  
    Overloading6 s2 = new Overloading6();  
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
} 


/*    Que)Does constructor return any value?

      Ans:yes,that is current class instance (You cannot use return type yet it returns a value).
      */
/*
ques:-Can constructor perform other tasks instead of initialization?

ans= Yes, like object creation, starting a thread, calling method etc.
 You can perform any operation in the constructor as you perform in the method.
*/