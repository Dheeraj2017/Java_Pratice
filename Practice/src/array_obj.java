import java.util.*;
public class array_obj {
public static void main(String args[]){
	Scanner s1=new Scanner(System.in);
	int n=s1.nextInt();
	int i;
//pay attention on the next line
	int b[] = new int [n];
	for( i=0;i<b.length;i++)
	{
		b[i]=s1.nextInt();
	}
int sum=0;
for(i=0;i<b.length;i++){
	System.out.println(b[i]);
}
for(i=0;i<b.length;i++)
{
	sum = sum + b[i];
}
System.out.println(sum);

int avg=sum/n;
System.out.println("avg = " + avg);
for(  i=0;i<b.length;i++){
	if(avg>b[i])
	{
		
		System.out.println(b[i]);
	}
}
}
}
