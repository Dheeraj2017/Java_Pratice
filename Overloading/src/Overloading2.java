/*Que)What is the purpose of default constructor?

Default constructor provides the default values to the object like 0, null etc. depending on the type.

Example of default constructor that displays the default values
*/
public class Overloading2{  
int id;  
String name;  
  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
Overloading2 s1=new Overloading2();  
Overloading2 s2=new Overloading2();  
s1.display();  
s2.display();  
}  
}

/*Explanation:In the above class,you are not creating any constructor so compiler provides you 
  a default constructor.Here 0 and null values are provided by default constructor.
 */