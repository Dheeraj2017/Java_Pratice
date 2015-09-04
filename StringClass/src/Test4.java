/*
  static String copyValueOf(char[] data)
  
  
----------- 
Description:
------------
 
 This method has two different forms: 
  
  1) public static String copyValueOf(char[] data)
    
     Returns a String that represents the character sequence in the array specified.
      
  2) public static String copyValueOf(char[] data, int offset, int count)
   
    Returns a String that represents the character sequence in the array specified.

------
Syntax: Here is the syntax of this method: 
------                
                public staticString copyValueOf(char[] data) 
                public staticString copyValueOf(char[] data,int offset,int count) 
                
                ----------
                Parameters: Here is the detail of parameters:  
                -----------               
                               
                               data => the character array. 
                               offset => initial offset of the subarray. 
                                count => length of the subarray.
                              
                
                
                
               
------------
Return Value :  This method returns a String that contains the characters of the character array.
------------

Example:

 */
 public class Test4{ 
	 public static void main(String args[]){
		 char[]Str1={'h','e','l','l','o',' ','w','o','r','l','d'}; 
		 String Str2=""; 
		 Str2=String.copyValueOf(Str1);
		 System.out.println("Returned String: "+Str2); 
		 Str2=String.copyValueOf(Str1,2,6); 
		 System.out.println("Returned String: "+Str2);
		 }
	 }
