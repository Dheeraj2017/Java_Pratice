//boolean value demonstration
public class BoolTest {
public static void main(String args[]){
	boolean b;
	b=false;
	System.out.println(" b is " +b);
	b=true;
	System.out.println(" b is " +b);
	//a boolean value can control the if statement
	if(b)  System.out.println("this is executed ");
	b=false;
	if(b)   System.out.println("this is not executed ");
	//outcome of a relational operator is a boolean value
	System.out.println("10>9 is " + (10>9));
}
}
/*java has a primitive type, called boolean, for logical values.abstractit can have only one of two
possible values, true and false. This is the type returned by all relational operators, as in the case of 
a<b. boolean is also the type required by the type required by the conditional expressions that govern
the control statements such as if and for */