interface PI1 
{ 
    // default method 
    default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
} 
  
interface PI2 
{ 
    // Default method 
    default void show() 
    { 
        System.out.println("Default PI2"); 
    } 
} 
  

class Multiple implements PI1, PI2 
{ 
    // Overriding default show method 
    public void show() 
    { 
        
        PI1.super.show(); 
  
        
        PI2.super.show(); 
    } 
  
    public static void main(String args[]) 
    { 
        Multiple d = new Multiple(); 
        d.show(); 
    } 
}