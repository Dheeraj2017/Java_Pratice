/*               Runtime Polymorphism with Multilevel Inheritance

Let's see the simple example of Runtime Polymorphism with multilevel inheritance.
*/
class Animal{  
void eat(){System.out.println("eating");}  
}  
  
class Dog extends Animal{  
void eat(){System.out.println("eating fruits");}  
}  
  
public class Runtime3 extends Dog{  
void eat(){System.out.println("drinking milk");}  
  
public static void main(String args[]){  
Animal a1,a2,a3;  
a1=new Animal();  
a2=new Dog();  
a3=new Runtime3();  
  
a1.eat();  
a2.eat();  
a3.eat();  
}  
}
