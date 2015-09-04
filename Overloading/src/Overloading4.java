/*Constructor Overloading

Constructor overloading is a technique in Java in which a class can have any number of constructors
that differ in parameter lists.The compiler differentiates these constructors 
by taking into account the number of parameters in the list and their type.

Example of Constructor Overloading
*/
public class Overloading4{  
    int id;  
    String name;  
    int age;  
    Overloading4(int i,String n){  
    id = i;  
    name = n;  
    }  
    Overloading4(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Overloading4 s1 = new Overloading4(111,"Karan");  
    Overloading4 s2 = new Overloading4(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}
