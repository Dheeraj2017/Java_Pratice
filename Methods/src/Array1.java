import java.util.*;
public class Array1 {
int  addition(int a[]){
	int sum=0;
	for(int i=0;i<a.length;i++){
		sum+=a[i];
	}

	return sum;

}
int maximum(int a[]){
	int i;
	int max=a[0];
	for(i=1;i<a.length;i++){
		if(max<a[i]){
			max=a[i];
		}
	}
return max;
}
int minimum(int a[]){
	int i;
	int min=a[0];
	for(i=1;i<a.length;i++){
		if(min>a[i]){
			min=a[i];
		}
	}
return min;
}
//left shift array
int [] lshift(int a[]){
	int i;
	for(i=0;i<a.length-1;i++){
		a[i]=a[i+1];
		
	}
	a[i]=0;
	return a;
	
}
int [] duplicate(int a[]){
	int i,j;
	for(i=0;i<a.length;i++){
		for(j=i+1;j<a.length;j++){
			if (a[i]==a[j]){
				a[j]=0;
			}
		}
	}
return a;	
}

int [] sorting (int a[]){
	int i,j;
	for(i=0;i<a.length;i++){
		for(j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
return a;
}

}
