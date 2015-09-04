/*
2) static method

If you apply static keyword with any method, it is known as static method

A static method belongs to the class rather than object of a class.
A static method can be invoked without the need for creating an instance of a class.
static method can access static data member and can change the value of it.
Example of static method
*/
//Program of changing the common property of all objects(static field).  
  
public class Student1{  
     int rollno;  
     String name;  
     static String college = "ITS";  
       
     static void change(){  
     college = "BBDIT";  
     }  
  
     Student1(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    Student1.change();  
  
    Student s1 = new Student (111,"Karan");  
    Student s2 = new Student (222,"Aryan");  
    Student s3 = new Student (333,"Sonoo");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  
