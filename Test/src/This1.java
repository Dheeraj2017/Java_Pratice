
public class This1{  
void m(){  
System.out.println(this);//prints same reference ID  
}  
  
public static void main(String args[]){  
This1 obj=new This1();  
System.out.println(obj);//prints the reference ID  
  
obj.m();  
}  
}  

