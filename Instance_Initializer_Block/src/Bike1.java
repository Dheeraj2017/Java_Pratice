          //ques=>What is invoked firstly instance initializer block or constructor?

class Bike1{  
    int speed;  
      
    Bike1(){System.out.println("constructor is invoked");}  
   
    {System.out.println("instance initializer block invoked");}  
       
    public static void main(String args[]){  
    Bike1 b1=new Bike1();  
    Bike1 b2=new Bike1();  
    }      
}

/*In the above example, it seems that instance initializer block is firstly invoked 
 but NO. Instance intializer block is invoked at the time of object creation. 
 The java compiler copies the instance initializer block in the constructor after the
 first statement super(). So firstly, constructor is invoked. 
*/