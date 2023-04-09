interface PI1 
{ 
    // default method 
    default void show()
{
System.out.println("Default PI0"); 
} 
   
}
  
interface PI2 
{ 
    
    void show(); 
    
} 
  

class Multiple1 implements PI1, PI2 
{ 
     
    public void show() 
    { 
           System.out.println("Default PI1"); 
    } 
  
    public static void main(String args[]) 
    { 
        Multiple1 d = new Multiple1(); 
        d.show(); 
    } 
}