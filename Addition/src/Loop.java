
public class Loop {
public static void main(String args[])
{
	int a=31;
	int b=73;
	int d=7,c;
	if(a>b){
		System.out.println("a is greater than b");
	System.out.println();
	System.out.println("a = " + a + " is greater than b : " + b );
	}
	else if(b>a){
		System.out.println("b is greater than a");
		System.out.println();
		System.out.println(b + " is greater than a " + a );
		}
	c=a+b;
	System.out.println("the addition of " + a + " and " + b + " is " + c);
	d=c/d; 
    System.out.println("the division of " + c + " and " + d + " is " + d);
    if(a>b&&a>d){
    	System.out.println("a is greater");
    }
    else if(b>d){
    	System.out.println("b is greater");
    }
    else {
    	System.out.println("d is greater");
    }
}
}

