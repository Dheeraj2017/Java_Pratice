/*The this keyword can be passed as argument in the constructor call.

We can pass the this keyword in the constructor also.
 It is useful if we have to use one object in multiple classes. Let's see the example:

*/
class B{  
  A obj;  
  B(A obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data);//using data member of A class  
  }  
}  
  
public class A{  
  int data=10;  
  A(){  
   B b=new B(this);  
   b.display();  
  }  
  public static void main(String args[]){  
   A a=new A();  
  }  
} 
