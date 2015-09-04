class Animal1{  
void eat(){System.out.println("animal is eating...");}  
}  
  
public class Runtime4 extends Animal1{  
void eat(){System.out.println("dog is eating...");}  
}  
  
class BabyDog extends Runtime4{  
public static void main(String args[]){  
Animal1 a=new BabyDog();  
a.eat();  
}} 
