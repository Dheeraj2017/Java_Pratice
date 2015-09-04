import java.util.*;
public class Addtion {
Scanner s1=new Scanner(System.in);
	int Add(){
		System.out.println("enter the value of no. of which additon want to perform");
		int n=s1.nextInt();
		int i;
		int a[] =new int [n];
		for( i=0;i<a.length;i++){
			System.out.print("enter the value of " + i );
			a[i]=s1.nextInt();
			System.out.println(" ");
		}
		int result1=0;
		for(i=0;i<a.length;i++){
			result1+=a[i];
		}
		//int a=s1.nextInt();
		//int b=s1.nextInt();
		//int result1=a+b;
		
		return result1;
		
	}
}
