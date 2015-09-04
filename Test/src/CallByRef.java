/*When you pass an object to a method, the situation changes dramatically, because objects
are passed by what is effectively call-by-reference. Keep in mind that when you create a
variable of a class type, you are only creating a reference to an object. Thus, when you pass
this reference to a method, the parameter that receives it will refer to the same object as that
referred to by the argument. This effectively means that objects are passed to methods by use
of call-by-reference. Changes to the object inside the method do affect the object used as an
argument. For example, consider the following program:*/


// Objects are passed by reference.
class Test2 {
int a, b;
Test2(int i, int j) {
a = i;
b = j;
}
// pass an object
void meth(Test2 o) {
o.a *= 2;

o.b /= 2;
}
}
class CallByRef {
public static void main(String args[]) {
Test2 ob = new Test2(15, 20);
System.out.println("ob.a and ob.b before call: " +
ob.a + " " + ob.b);
ob.meth(ob);
System.out.println("ob.a and ob.b after call: " +
ob.a + " " + ob.b);
}
}
/*When a primitive type is passed to a method, it is done by use of call-by-value. Objects
are implicitly passed by use of call-by-reference.*/