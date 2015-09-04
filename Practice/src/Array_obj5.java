//sorting of array  
import java.util.*;
public class Array_obj5 {
public static void main(String[] args){
	Scanner s1=new Scanner(System.in);
	int i,j;
	int n=s1.nextInt();
	int a[]=new int [n];
	for(i=0;i<a.length;i++){
		a[i]=s1.nextInt();
	}
	for(i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	for(i=0;i<a.length;i++){
		for(j=i+1;j<a.length;j++){
		if (a[i]>a[j])
			{
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
		}
	}
		
	for(i=0;i<a.length;i++){
	System.out.println(a[i]);
	}
}
}
