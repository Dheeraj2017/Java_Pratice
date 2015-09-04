/*  Restrictions for static method

There are two main restrictions for the static method. They are:
The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context.

*/
class A{  
 //int a=40;//non static  
//static int a=13; //this is static so main method can take tyhis value   
 public static void main(String args[]){  
  int a=12;
	 System.out.println(a);  
 }  
}

/*Que)why main method is static?

Ans) because object is not required to call static method if it were non-static method, 
jvm create object first then call main() method that will lead the problem of extra memory allocation.
*/