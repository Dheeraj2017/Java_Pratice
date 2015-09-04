
/*A Closer Look at Argument Passing
In general, there are two ways that a computer language can pass an argument to a subroutine.
The first way is call-by-value. This approach copies the value of an argument into the formal
parameter of the subroutine. Therefore, changes made to the parameter of the subroutine
have no effect on the argument. The second way an argument can be passed is call-by-reference.
In this approach, a reference to an argument (not the value of the argument) is passed to the
parameter. Inside the subroutine, this reference is used to access the actual argument specified
in the call. This means that changes made to the parameter will affect the argument used to
call the subroutine. As you will see, Java uses both approaches, depending upon what is passed.
In Java, when you pass a primitive type to a method, it is passed by value. Thus, what
occurs to the parameter that receives the argument has no effect outside the method. For
example, consider the following program:*/
// Primitive types are passed by value.
class Test1 {
void meth(int i, int j) {
i *= 2;
j /= 2;
}
}
class CallByValue {
public static void main(String args[]) {
Test1 ob = new Test1();
int a = 15, b = 20;
System.out.println("a and b before call: " + a + " " + b);
ob.meth(a, b);
System.out.println("a and b after call: " + a + " " + b);
}
}