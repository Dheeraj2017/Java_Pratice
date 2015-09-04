//final keyword are used with class for stop the inheritance
//final keyword are used with the variable for declear the constant

//method overiding ko stop karne ke liye
public class variable {
final int speed=90; //final variable
void run(){
	//speed=100;
	System.out.println("ans=  " + speed);
}
public static void main(String args[]){
	variable obj=new variable();
	System.out.println(obj.speed);
	obj.run();
}
}


/*The final keyword in java is used to restrict the user. The final keyword can be used in many context. Final can be:

a) variable
b) method
c) class
The final keyword can be applied with the variables,
 a final variable that have no value it is called blank final variable or uninitialized final variable.
  It can be initialized in the constructor only.
   The blank final variable can be static also which will be initialized in the static block only. 

*/