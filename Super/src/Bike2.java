class Vehicle3{  
  Vehicle3(){System.out.println("Vehicle is created");}  
}  
  
class bike2 extends Vehicle{  
  int speed;  
  bike2(int speed){  
    this.speed=speed;  
    System.out.println(speed);  
  }  
  public static void main(String args[]){  
   bike2 b=new bike2(10);  
 }  
}
