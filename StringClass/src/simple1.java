/*3) By compareTo() method:

compareTo() method compares values and returns an int which tells if the values compare less than, equal, or greater than.
Suppose s1 and s2 are two string variables.If:


s1 == s2   :0
s1 > s2    :positive value
s1 < s2    :negative value

  */
class simple1{  
 public static void main(String args[]){  
   
   String s1="Sachin";  
   String s2="Sachin";  
   String s3="Ratan";  
  
   System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
 }  
}  