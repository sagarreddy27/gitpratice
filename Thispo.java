class Thispo
{ 
    int a; 
    int b; 
      
    // Parameterized constructor 
   Thispo(int a, int b) r
    { 
        this.a = a; 
        this.b = b; 
    } 
  
    void display() 
    { 
        //Displaying value of variables a and b 
        System.out.println("a = " + a + "  b = " + b); 
    } 
  
    public static void main(String[] args) 
    { 
        Thispo object = new Thispo(10, 20); 
        object.display(); 
    } 
} 