
public class Test1 {
   void m()
   {
	   
	  System.out.println(this);  //prints same reference
   }
   
   public static void main(String args[]){
	   Test1 obj = new Test1();
	   System.out.println(obj);  //print the reference ID
	   obj.m();
   }
}

//by this we can prove that this keyword made the reference of the same class 
// in the output of the above code is  that is there is 
//first name of the package then name of the function 
// @1db9742 is the address part
