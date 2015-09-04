/**documentation comment*/
/*java is a case sensitive language*/
/* this is called multiline comment*/
//single line comment


public class Example2 {
	
	//public, private is the access specifier, which allows the programmer to control the visibility of class members.
public static void main(String args[])
/*  static is the keyword allows the main() to be called without having to instantiate a particular instance of class
 * yani main() ko call karane ke liye object banane ki jarurt nahi hai 
 * convention hai ki class ka naam CAPITAL se start hona chaiye 
 * in main() there is only one parameter. String args[] declears parameter named args, which is an array of instances of the 
 * class String. Objects of type String store character strings.
 * 
 */
{
	int num; //this declears a variable called num
	num=100;
	System.out.println("this is num : " +num);
	/*println() and print() is a pre-defined methods which display the string which is passed to it .
	 System is a predefined class that provide access to the system and 
	 out is the output stream that is connected to the console.
	 */
	num*=2;
	System.out.print("the value of num * 2 is: " );
	System.out.println(num );
}
}
/*print() mai new line character nahi lega yaani continue hi likha aayega. jabki 
  println() mai last mai display ke baad new line character le leta hai 
    */
 