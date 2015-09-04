//Program in case super is not required

class Person1{  
void message(){System.out.println("welcome");}  
}  
  
class Student1 extends Person1{  
  
void display(){  
message();//will invoke parent class message() method  
}  
  
public static void main(String args[]){  
Student1 s=new Student1();  
s.display();  
}  
}

