/*The static keyword is used in java mainly for memory management. We may apply static keyword with variables, methods, blocks and nested class. The static keyword belongs to the class than instance of the class.

The static can be:

variable (also known as class variable)
method (also known as class method)
block
nested class

*/
//Program of static variable  

public class Student{  
 int rollno;  
 String name;  
 static String college ="ITS";  
   
 Student(int r,String n){  
 rollno = r;  
 name = n;  
 }  
void display (){System.out.println(rollno+" "+name+" "+college);}  

public static void main(String args[]){  
Student s1 = new Student (111,"Karan");  
Student s2 = new Student (222,"Aryan");  
 
s1.display();  
s2.display();  
}  
}
/*1) static variable

If you declare any variable as static, it is known static variable.
The static variable can be used to refer the common property of all objects
 (that is not unique for each object) e.g. company name of employees,college name of students etc.
The static variable gets memory only once in class area at the time of class loading.
Advantage of static variable

It makes your program memory efficient (i.e it saves memory).
Understanding problem without static variable

class Student{  
     int rollno;  
     String name;  
     String college="ITS";  
}  

Suppose there are 500 students in my college, now all instance data members will get memory each time 
when object is created.All student have its unique rollno and name so instance data member is good.
Here, college refers to the common property of all objects.If we make it static,this field will get memory only once.

RULE:- static property is shared to all objects.

*/
