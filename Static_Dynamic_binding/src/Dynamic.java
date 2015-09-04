        //Dynamic binding

//When type of the object is determined at run-time, it is known as dynamic binding.

//Example of dynamic binding

class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
public class Dynamic extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal a=new Dynamic();  
  a.eat();  
 }  
}
