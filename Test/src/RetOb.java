/*Returning Objects
  
  
A method can return any type of data, including class types that you create. For example, in
the following program, the incrByTen( ) method returns an object in which the value of a is
ten greater than it is in the invoking object.*/
 
 
 
     // Returning an object.
class Test3 {
int a;
Test3(int i) {
a = i;
}
Test3 incrByTen() {
Test3 temp = new Test3(a+10);
return temp;
}
}
class RetOb {
public static void main(String args[]) {
Test3 ob1 = new Test3(2);
Test3 ob2;
ob2 = ob1.incrByTen();
System.out.println("ob1.a: " + ob1.a);
System.out.println("ob2.a: " + ob2.a);
ob2 = ob2.incrByTen();
System.out.println("ob2.a after second increase: "
+ ob2.a);
}
}
