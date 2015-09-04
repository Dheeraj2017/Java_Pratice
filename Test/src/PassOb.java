//using objects as parameter
// Objects may be passed to methods.
class Testt {
int a, b;
Testt(int i, int j) {
a = i;
b = j;
}
// return true if o is equal to the invoking object
boolean equals(Testt o) {
if(o.a == a && o.b == b) return true;
else return false;
}
}
class PassOb {
public static void main(String args[]) {
Testt ob1 = new Testt(100, 22);
Testt ob2 = new Testt(100, 22);
Testt ob3 = new Testt(-1, -1);
System.out.println("ob1 == ob2: " + ob1.equals(ob2));
System.out.println("ob1 == ob3: " + ob1.equals(ob3));
}
}

/*As you can see, the equals( ) method inside Test compares two objects for equality and
returns the result. That is, it compares the invoking object with the one that it is passed. If
they contain the same values, then the method returns true. Otherwise, it returns false. Notice
that the parameter o in equals( ) specifies Test as its type. Although Test is a class type created
by the program, it is used in just the same way as Java’s built-in types.*/
