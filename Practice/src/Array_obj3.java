//lift shifting of array (1 -D) by 1
import java.util.*;
public class Array_obj3 {
public static void  main(String[] args)
{
	int i;
	Scanner s1=new Scanner(System.in);
	int n=s1.nextInt();
	int a[]= new int [n];
	for( i=0;i<a.length;i++){
		a[i]=s1.nextInt();
		
	}
	for(i=0;i<a.length;i++){
		System.out.println(a[i]);
		
	}
	for(i=0;i<a.length-1;i++)
	{
		a[i]=a[i+1];
	}
a[i]=0;
for(i=0;i<a.length;i++){
System.out.println(a[i]);
}
}
}
