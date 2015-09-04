import java.util.Scanner;
public class scanner1 {
public static void main(String args[]){
	Scanner bucky=new Scanner(System.in);
	double first, sec, ans;
	System.out.println("enter the first number");
	first=bucky.nextDouble();
	System.out.println("enter the second number");
	sec=bucky.nextDouble();
	ans=first+sec;
	System.out.println(ans);
	
	
	//System.out.println(bucky.nextLine());
}
}
