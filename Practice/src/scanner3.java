//factorial program
import java.util.*;
public class scanner3 {
	long  fact()
{
	long f=1,i,n;
	Scanner s1=new Scanner(System.in);
System.out.println("enter the number whose factorial want to know");
//n=s1.nextDouble();
n=s1.nextLong();

for(i=1;i<=n;i++){
	f=f*i;
}

return f;
}
}
 class factorial1{
	public static void main(String args[])
	{
		scanner3 input=new scanner3();
		long result=input.fact();
	
	System.out.println("factorial of is "  + result);
	}
}