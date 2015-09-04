
public class Test {

	int roll;
	int marks;
	
	//constructor do not require and return type
	
	Test(){
		roll=101;
		marks=90;
		System.out.println("hiii roll no.= " + roll+ " marks= " +marks);
	}
	Test(int a,int b){
		roll=a;
		marks=b;
		System.out.println("hello roll no. = " + roll+ " marks= " + marks);
		
	}
	 int display(){
		 
		 
	System.out.println("roll number= " + roll + " marks=  " + marks);
	
		 return 0;
		 
	 }
	public static void main(String args[]){
		Test t1=new Test();
	Test t2=new Test(103,87);
	Test t3=new Test(2103,80);
	t1.display();
	t2.display();
	t3.display();
	
	}
	
}

