import java.util.*;
public class Calculator {
public static void main(String args[]){
	Scanner s1=new Scanner(System.in);
    Addtion a1=new Addtion();
int ans1=a1.Add();
System.out.println("ans of the addtion is : " + ans1);
Subtraction b1=new Subtraction();
int ans2=b1.Sub();
System.out.println("ans of the Subtraction is : " + ans2);


}
}
