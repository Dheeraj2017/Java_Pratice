
public class Calc {
    
	//class variable 
int add(int a, int b){
	int c=a+b;
	return c;
}
int sub(int a, int b){
	int c=a-b;
	return c;
}
int mul(int a, int b){
	int c=a*b;
	return c;
}
int div(int a, int b){
	//if(b!=0)
	//{
	int c=a/b;

	//}
	//else{
		//System.out.println("not defined because b= " + b );
	//}
return c;
}

int mod(int a, int b){
	int c=a%b;
	return c;
}

public static void main(String args[]){
	
//making of the object for the class calc
	
	//syntax
	//classname objectname = new default_constructor();
	
	Calc c1 = new Calc();
	int s = c1.add(15,3 );
System.out.println("addition is " + s );

int s1 = c1.sub(15,3 );
System.out.println("subtraction  is " + s1 );
   
int s2 = c1.mul(15,3 );
System.out.println("multiplication  is " + s2 );
   
int s3 = c1.div(15,3 );
System.out.println("division  is " + s3 );
   
int s4 = c1.mod(15,3 );
System.out.println("modulus  is " + s4 );
   

}
	
	
	
}

