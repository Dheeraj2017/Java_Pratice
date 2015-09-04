import java.util.*;
public class Simple_Interest extends Calculator  {
	Scanner s1=new Scanner(System.in);
static int p;
static int r;
static int t;
	void input(){
	

	System.out.println("enter the value of a ");
 p=s1.nextInt();
System.out.println(" enter the value of b ");
 r=s1.nextInt();
System.out.println(" enter the value of c ");
t=s1.nextInt();
 
}
    public static void main(String args[]){
	
    	Simple_Interest c1=new Simple_Interest();
	c1.input();
	
	int result1=multiplication(p, r, t);
    int result2=division(result1,100);

System.out.println("ans is : " + result2 );	
}
}
