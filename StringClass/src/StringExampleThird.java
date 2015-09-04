
public class StringExampleThird {
public static void main(String args[]){
	//substring method in string 
	String s="abcdefghi";
	System.out.println("s.substring(5)=>"+s.substring(5));
	System.out.println("s.substring(5,8)=>"+s.substring(5,8));
	System.out.println("s.substring(5,7)=>"+s.substring(5,7));
	System.out.println("s.substring(5,6)=>"+s.substring(5,6));
	System.out.println("s.substring(5,5)=>"+s.substring(5,5));
	//System.out.println("s.substring(5,4)=>"+s.substring(5,4));
	//exception occoured string index out of bound
	
	//   toLowerCase   method on string 
	String lower="ABCDefghiJ";
			System.out.println("toLowerCase=>"+lower.toLowerCase());
			
		//   toUpperCase   method on string 
			String upper="ABCDefghiJ";
					System.out.println("toUpperCase=>"+upper.toUpperCase());
					
					//trim  method in string
		
			String trimtest ="  hey here is the blank space  ";
		System.out.println("After Trim :"+trimtest.trim());
		System.out.println("before Trim :"+trimtest);
		
			
}
}
