
public class StringExampleSecond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//concat method in string
		String s1="one";
		s1=s1.concat("two");
		System.out.println("concat s1 ans s2 => " + s1);
		System.out.println("concat s1 ans s2 => " + s1.concat("three"));

//CharAt method in string
		String s="Alfanso Mango";
		System.out.println("CharAt=> " + s.charAt(2));
		System.out.println("CharAt=> " + s.charAt(6));
		System.out.println("CharAt=> " + s.charAt(7));
		
		//length method in string
		String name="Aman kumar";
		System.out.println("length of name=> " +name.length());
		
		//replace method in string
		String p= "VaVavavav ";
		System.out.println("replace of v to T => " +p.replace('v','T'));
		String name1="Praanj";
		if(name1.equals("PRAANJ")){
			System.out.println("Yes in the equals");
			
		}
		if(name1.equalsIgnoreCase("PRAANJ")){
			System.out.println("Yes in this equalsIgnorecase");
			
		}
	}

}
