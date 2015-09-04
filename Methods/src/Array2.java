import java.util.Scanner;

public class Array2{
	public static void  main(String args[]){
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
	//int type array ka declrare and initialise 
		int b[]=new int [n];
		Array1 a1=new Array1();
		for(int i=0;i<b.length;i++){
			System.out.println("enter the  " + i + " term ");
			b[i]=s1.nextInt();
		}
	int result=	a1.addition(b);
	System.out.println("sum of the array:  " + result  );
	
	int c[] =a1.lshift(b);
	for(int i=0;i<c.length;i++){
		System.out.println(c[i]);
	}
	int d[] =a1.duplicate(b);
	for(int i=0;i<d.length;i++){
		System.out.println(d[i]);
	}
	int e[] =a1.sorting(b);
	for(int i=0;i<e.length;i++){
		System.out.println(e[i]);
	}
	int result2 =a1.maximum(b);
	
		System.out.println("max= " + result2);
		System.out.println(" ");
		int result3 =a1.minimum(b);
		
		System.out.println("min= " + result3);

	
	
	}
}
