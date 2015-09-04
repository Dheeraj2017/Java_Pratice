//type conversion and type casting
public class Conversion {
public static void main(String args[]){
	byte b;
	int i=257;
	double d=323.231;
	System.out.println("\nconversion of int into byte");
       b= (byte) i;
     System.out.println("i and b " + i + " " + b);
     
 	System.out.println("\nconversion of double into int ");
    i= (int) d;
  System.out.println("d and i " + d + " " + i);
	System.out.println("\nconversion of double into byte");
    b= (byte) d;
  System.out.println("d and b " + d + " " + b);
 }
}
//here byte is a keyword like int and double 
// integer = int , long, byte, short
//floating point= float, double
