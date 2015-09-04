
public class Scope {
public static void main(String args[]){
	int x;  //known to all code within main
	x=10;
	if(x==10){
		int y=20;
	
	//x and y both know here
	System.out.println("x and y: " + x + " " + y);
	x= y * 2;
	
}
//y=100;   //error! y not known here
//x is still known here.

System.out.println(" x is " + x);

}}