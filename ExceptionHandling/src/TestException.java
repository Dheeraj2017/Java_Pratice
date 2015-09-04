
public class TestException {

	int divide(int a , int b)
	
	{
		System.out.println("today");
		int c=0;
		try{
			c=a/b;
			System.out.println("next code");
			
				
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("int this catch " + e);
			
		}
		return c;
	}
	void display(){
		System.out.println("nexrt code in the display is : " ) ;
		
	}
	
	
	public static void main(String args[]){
	TestException t1=new TestException();
	int t= t1.divide(4,0);
	System.out.println("data is " + t);
	t1.display();
	int tt= t1.divide(4,2);
	System.out.println("data is " + tt);
	t1.display();
	
}
}
