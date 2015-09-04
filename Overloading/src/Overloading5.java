//Copying the values of one object to another like copy constructor in C++
/*
There are many ways to copy the values of one object into another. They are:

   1) By constructor
   2) By assigning the values of one object into another
   3) By clone() method of Object class


In this example, we are going to copy the values of one object into another using constructor.
*/
public class Overloading5{  
    int id;  
    String name;  
    Overloading5(int i,String n){  
    id = i;  
    name = n;  
    }  
      
    Overloading5(Overloading5 s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Overloading5 s1 = new Overloading5(111,"Karan");  
    Overloading5 s2 = new Overloading5(s1);  
    s1.display();  
    s2.display();  
   }  
}
