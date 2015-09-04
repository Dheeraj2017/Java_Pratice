
//parametized constructor

public class Overloading3{  
    int id;  
    String name;  
      
    Overloading3(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Overloading3 s1 = new Overloading3(111,"Karan");  
    Overloading3 s2 = new Overloading3(222,"Aryan");  
    s1.display();  
    s2.display();  
   }  
}

