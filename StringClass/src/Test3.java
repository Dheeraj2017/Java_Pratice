/*     boolean contentEquals(StringBuffer sb)

-----------
Description: 
-----------  
  
  This method returns true if and only if this String represents the same sequence of characters
  as the specified in StringBuffer. 
  
  ------
  Syntax: Here is the syntax of this method:
  ------            
              public boolean contentEquals(StringBuffer sb) 
              
              -----------
              Parameters:   Here is the detail of parameters: 
              -----------               sb -- the StringBuffer to compare.
             

------------
Return Value:              This method returns true if and only if this String represents the same sequence
------------               of characters as the specified in StringBuffer, otherwise false.

Example:
	
	*/
	public class Test3{
	public static void main(String args[]){
		String str1 ="Not immutable"; 
		String str2 ="Strings are immutable";
		StringBuffer str3 =new StringBuffer("Not immutable");
		boolean result = str1.contentEquals( str3 );
		System.out.println(result);
		result = str2.contentEquals( str3 );
		System.out.println(result); 
		}
	}
