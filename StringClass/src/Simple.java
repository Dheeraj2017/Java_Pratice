//equals check the contents 
/*1) By equals() method

equals() method compares the original content of the string.
   It compares values of string for equality.String class provides two methods:


public boolean equals(Object another){}                  compares this string to the specified object.
public boolean equalsIgnoreCase(String another){}        compares this String to another String, ignoring case.

*/

class Simple{  
 public static void main(String args[]){  
   
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   String s4="Saurav";  
  
   System.out.println(s1.equals(s2));//true  
   System.out.println(s1.equals(s3));//true  
   System.out.println(s1.equals(s4));//false  
 }  
} 