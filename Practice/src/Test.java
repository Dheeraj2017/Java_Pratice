//constructor is a special type of member function which is used to insitialze the object or we can say that 
//initialze the variables of the class , it has no return type , require no calling , having the same
//name as that of the class name .
public class Test {
int id; 
String name;
	Test(){
	id=101;
	name="aman";
	
}
	Test(int i,String no){
		id=i;
		name=no;
		
	}
	void display(){
		System.out.println("id:  " + id + " \nname: " + name + " ");
		
	}
	public static void main(String args[]){
	Test s3 = new Test();
	Test s1 = new Test(111,"dheeraj");
	Test s2 = new Test(121,"daksh");
	s1.display();
	s2.display();
	s3.display();
	System.out.println(s1.id);
	System.out.println(s1.name);
	System.out.println(s2.id);
	System.out.println(s2.name);
	System.out.println(s3.id);
	System.out.println(s3.name);
	
	
	
}
}
