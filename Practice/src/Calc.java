
import java.util.*;
 class Calc1 {
int multiply(int a,int b,int c){
	int d=a*b*c;
	return d;
	
}
int division(int a,int b){
	if(b==0){
		System.exit(0);//if any thing is not working in division like condition then ....use this 
		//system.exit(0).....used for the directly goes out
	}
	int c=a/b;
	return c;
}
}

class Intrest{
	int SimpleInt(int p,int r,int t){
		Calc1 c1=new Calc1();
		int s=c1.multiply(p, r, t);
		int k=c1.division(s, 100);
		return k;
	}
}
 class TotalResult{
	public static void main(String args[])
{
	Intrest i1=new Intrest();
	int p,r,t;
	System.out.println("enter the value of a, b ,c");
	Scanner s1=new Scanner(System.in);
	p=s1.nextInt();
	r=s1.nextInt();
	t=s1.nextInt();
    int res=i1.SimpleInt(p,r,t);
	System.out.println("ans is : " + res );
		}
}