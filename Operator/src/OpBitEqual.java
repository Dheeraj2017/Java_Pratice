public class OpBitEqual {
public static void main(String args[]) {
int a = 1;
int b = 2;
int c = 3;
a |= 4;
b >>= 1;
c <<= 1;
a ^= c;
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
}
}


/*
 int done;
// ...
if(!done) ... // Valid in C/C++
if(done) ... // but not in Java.

In Java, these statements must be written like this:

if(done == 0) ... // This is Java-style.
if(done != 0) ...


The reason is that Java does not define true and false in the same way as C/C++. In C/C++,
true is any nonzero value and false is zero. In Java, true and false are nonnumeric values that
do not relate to zero or nonzero. Therefore, to test for zero or nonzero, you must explicitly
employ one or more of the relational operators.

 */