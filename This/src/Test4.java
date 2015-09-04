/*
constructor:-
    1)is a special type of member function  which is used to initialize the class variable on the run time.
    2)constructor name and class name is always same.
    3)constructor do not have any return type
    4)constructor are called on object creation time.


*/
public class Test4 {

	int roll;
	int marks;
	
	//construtor do not require and return type
	
	Test4(){
		roll=101;
		marks=90;
		System.out.println("hiii roll no.= " + roll+ " marks= " +marks);
	}
	Test4(int roll,int marks){
		this.roll=roll;
		this.marks=marks;
		System.out.println("hello roll no. = " + roll+ " marks= " + marks);
		
	}
	 int display(){
		 
		 
	System.out.println("roll number= " + roll + " marks=  " + marks);
	
		 return 0;
		 
	 }
	public static void main(String args[]){
		Test4 t1=new Test4();
	Test4 t2=new Test4(103,87);
	Test4 t3=new Test4(2103,80);
	t1.display();
	t2.display();
	t3.display();
	System.out.println(t1.marks);
	System.out.println(t1.roll);
	System.out.println(t2.marks);
	System.out.println(t2.roll);
	System.out.println(t3.marks);
	System.out.println(t3.roll);
	
	
	}
}
