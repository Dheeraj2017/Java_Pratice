import java.util.*;
public class Array {

int[] initialize(){
	Scanner s1=new Scanner(System.in);
System.out.println("enter the value of n:");
	int n=s1.nextInt();
int m=5;
		int b[]=new int [m];
try{
		//for(int i=0;i<b.length-2;i++){
	//b[i]=s1.nextInt();
//}
	b[0]=1;
	b[1]=2;
	b[2]=3;
	b[3]=4;
	b[4]=5;
	b[5]=6;
	
	
	}
	catch(ArrayIndexOutOfBoundsException e1){
	e1.printStackTrace();
	System.out.println("array index is out of bound exception " + e1);
	
	}



	return b;
}
	
void  display(int arr[]){
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
	
	public static void main(String args[]){
	//Scanner s1=new Scanner(System.in);
//int n=s1.nextInt();
//int a[]=new int [n];

		Array a1=new Array();
		int a[]=a1.initialize();
	a1.display(a);
	
	}
}
