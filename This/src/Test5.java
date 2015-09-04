public class Test5{
int id;
String name;
Test5()
{
System.out.println("Two");
}
Test5(int id, String name){
this();
System.out.println("Three");
this.id=id;
this.name=name;


}
void display(){
System.out.println("Three");
System.out.println(id + " " + name);
}
public static void main(String args[])
{
Test5 e1=new Test5();

e1.display();
Test5 e2=new Test5(222,"aryan");
e2.display();


}
}
