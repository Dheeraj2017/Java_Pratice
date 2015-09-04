class A1{  
A1(){  
System.out.println("parent class constructor invoked");  
}  
}  
  
public class initializer1 extends A1{  
initializer1(){  
super();  
System.out.println("child class constructor invoked");  
}  
  
initializer1(int a){  
super();  
System.out.println("child class constructor invoked "+a);  
}  
  
{System.out.println("instance initializer block is invoked");}  
  
public static void main(String args[]){  
initializer1 b1=new initializer1();  
initializer1 b2=new initializer1(10);  
}  
}
