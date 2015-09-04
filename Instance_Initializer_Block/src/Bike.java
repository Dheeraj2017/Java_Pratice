/*                            Instance initializer block:

 Instance Initializer block is used to initialize the instance data member.
 It run each time when object of the class is created.

The initialization of the instance variable can be directly but there can be performed
extra operations while initializing the instance variable in the instance initializer block.

*/
/*
Que) What is the use of instance initializer block while we can directly assign
     a value in instance data member? For example:
*/
              /*class Bike{  
                      int speed=100;  
              } */ 
              

               /*ques=>Why use instance initializer block?
ans=>
     Suppose I have to perform some operations while assigning value to instance data member
      e.g. a for loop to fill a complex array or error handling etc.

*/


//Example of instance initializer block

class Bike{  
    int speed;  
      
    Bike(){System.out.println("speed is "+speed);}  
   
    {speed=100;}  
       
    public static void main(String args[]){  
    Bike b1=new Bike();  
    Bike b2=new Bike();  
    }      
}  

/*
                            There are three places in java where you can perform operations:
          1) method
          2)constructor
          3)block
*/