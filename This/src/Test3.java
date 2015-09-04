//this keyword is also used for invoke parametazied constructor
public class Test3 {

	int id;
	String name;
	String city;
	Test3(int id,String name){
		this.id=id;
		this.name=name;
		}
	Test3(int id,String name,String city){
		this(id,name);//calling the paramatized constructor of the same class 
		this.city=city;
		}
	void display(){
		System.out.println(id + " " + name + " " + city);
	}
	
	
	
	public static void main(String args[]){
		Test3 e1= new Test3(111,"karan");
		Test3 e2= new Test3(1331,"aryan","delhi");
		e1.display();
		e2.display();
		
	}
	
}
