/*Q) Is final method inherited?

Ans) Yes, final method is inherited but you cannot override it. For Example:
*/
class Bike4{  
  final void run(){System.out.println("running...");}  
}  
class Honda1 extends Bike4{  
   public static void main(String args[]){  
    new Honda1().run();  
   }  
}  
