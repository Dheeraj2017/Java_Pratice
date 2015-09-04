//the use of the  " this " keyword
//"this" keyword make reference of the same class
public class Test2 {
int id;
String name;

Test2(){
System.out.println("default constructor");	
}

Test2(int id,String name){
	this();   //it is used to invoked current class constructor
//this keyword is also used for hiding instance variable 
	this.id=id;
this.name=name;

}



void display(){
	System.out.println(id + " " +name);
}

public static void main(String args[]){
	
	Test2 e1=new Test2(111,"dheeraj");
	Test2 e2=new Test2(121,"daksh");
	e1.display();
	e2.display();
	
	
}

}