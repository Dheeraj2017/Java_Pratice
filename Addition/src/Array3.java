//duplicate array ke element ko hatana nd uski place per zero display karna 
public class Array3 {
public static void main(String args[])
{
	int i,j;
	int a[]={2,3,4,2,3,6};
	for(i=0;i<a.length;i++){
		for(j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
				a[j]=0;
			}
		}
	}
	for(i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	
	}
}
