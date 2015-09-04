//left shift of array
public class Array2 {
public static void main(String args[]){
	int i;
	int a[]= {2,3,4,5,6};
	for(i=0;i<a.length-1;i++){
		a[i]=a[i+1];
		
	}
	a[i]=0;
	for(i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
}
}

