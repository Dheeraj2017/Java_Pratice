import java.util.*;
public class scanner4 {
public static void main(String[] args)
{
first f1=new first();
f1.dheeraj();

}

}
class first{
	void dheeraj(){
	Scanner s1=new Scanner(System.in);
	String ch="dheeraj",ch1;
	System.out.println("enter the string");
	ch1=s1.nextLine();
	System.out.println("hello " + ch + " " + ch1);
	}
}
