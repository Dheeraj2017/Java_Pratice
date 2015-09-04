/*The last control statement is return. The return statement is used to explicitly return from
a method. That is, it causes program control to transfer back to the caller of the method.
As such, it is categorized as a jump statement. Although a full discussion of return must
wait until methods are discussed in Chapter 6, a brief look at return is presented here.
At any time in a method the return statement can be used to cause execution to branch
back to the caller of the method. Thus, the return statement immediately terminates the
method in which it is executed. The following example illustrates this point. Here, return
causes execution to return to the Java run-time system, since it is the run-time system that
calls main( ).*/
// Demonstrate return.
class Return {
public static void main(String args[]) {
boolean t = true;
System.out.println("Before the return.");
if(t) return; // return to caller
System.out.println("This won't execute.");
}
}

/*As you can see, the final println( ) statement is not executed. As soon as return is executed,
control passes back to the caller.*/