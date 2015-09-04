import java.util.*;
public class Array_obj2 {
public static void main(String [] args){
	Scanner s1=new Scanner(System.in);
	int n= s1.nextInt();
	int a[] =new int [n];
for(int i=0;i<a.length;i++)
	
{
	a[i]=s1.nextInt();
	
}
for( int i = 0;i<a.length;i++)
	
{
	//a[i]=s1.nextInt();
	System.out.println(a[i]);
}
int max,min;
max=a[0];
for( int i=1;i<a.length;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
}
System.out.println("max= " + max );
min=a[0];
for( int i=1;i<a.length;i++)
{
	if(min>a[i])
	{
		min=a[i];
	}
}
System.out.println("min= " + min );

}
}
