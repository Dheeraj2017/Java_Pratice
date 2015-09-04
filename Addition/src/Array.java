
public class Array {
public static void main(String args[]){
	int i;
	int a[] = {2,3,41,5,7};
	int max;
	max=a[0];
	for(i=1;i<a.length;i++){
		if(a[i]>max){
			max=a[i];
			}
	}
	
	for(i=0;i<a.length;i++){
	System.out.println("array is: " + a[i]);
}
	System.out.println("max is: " +max);
}
}
