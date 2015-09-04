/*Que)Can we execute a program without main() method?

Ans)Yes, one of the way is static block but in previous version of JDK not in JDK 1.7.

*/

class A2{  
  static{  
  System.out.println("static block is invoked");  
  System.exit(0);  
  }  
}  


