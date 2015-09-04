
/*In some cases, Java’s automatic type conversions can play a role in overload resolution.
For example, consider the following program:*/
// Automatic type conversions apply to overloading.
class Over {
void test() {
System.out.println("No parameters");
}
//Overload test for two integer parameters.
void test(int a, int b) {
System.out.println("a and b: " + a + " " + b);
}
//overload test for a double parameter
void test(double a) {
System.out.println("Inside test(double) a: " + a);
}
}
public class Overload1 {
public static void main(String args[]) {
Over ob = new Over();
int i = 88;
ob.test();
ob.test(10, 20);
ob.test(i); // this will invoke test(double)
ob.test(123.2); // this will invoke test(double)
}
}
/*As you can see, this version of OverloadDemo does not define test(int). Therefore, when
test( ) is called with an integer argument inside Overload, no matching method is found.
However, Java can automatically convert an integer into a double, and this conversion can
be used to resolve the call. Therefore, after test(int) is not found, Java elevates i to double
and then calls test(double). Of course, if test(int) had been defined, it would have been called
instead. Java will employ its automatic type conversions only if no exact match is found.
Method overloading supports polymorphism because it is one way that Java implements
the “one interface, multiple methods” paradigm.*/


/*For instance, in C, the function abs( ) returns the absolute value of
an integer, labs( ) returns the absolute value of a long integer, and fabs( ) returns the absolute
value of a floating-point value. Since C does not support overloading, each function has to
have its own name, even though all three functions do essentially the same thing. This makes
the situation more complex, conceptually, than it actually is. Although the underlying concept
of each function is the same, you still have three names to remember. This situation does not
occur in Java, because each absolute value method can use the same name. Indeed, 
Java’sstandard class library includes an absolute value method, called abs( ). This method is
overloaded by Java’s Math class to handle all numeric types. Java determines which version
of abs( ) to call based upon the type of argument.*/
