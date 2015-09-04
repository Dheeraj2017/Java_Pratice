class Vehicle1{  
void run(){System.out.println("Vehicle is running");}  
}  
public class Overriding1 extends Vehicle1{  
void run(){System.out.println("Bike is running safely");}  
  
public static void main(String args[]){  
Overriding1 obj = new Overriding1();  
obj.run();  
}
}

/*

ques=>  Can we override static method?

ans=>No, static method cannot be overridden. It can be proved by runtime polymorphism so we will learn it later.

*/
/*
ques=>Why we cannot override static method?

ans=>because static method is bound with class whereas instance method is bound with object. Static belongs to class area and instance belongs to heap area.
*/
/*
ques=>Can we override java main method?

ans=>No, because main is a static method.*/