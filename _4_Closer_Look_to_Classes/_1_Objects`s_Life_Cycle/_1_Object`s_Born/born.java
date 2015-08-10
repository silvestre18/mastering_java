/* The born of an object will be explained here */

class born1   // Lets create a class born1
{
  // The born of an object starts with the word new
  
  void method1()       // a method of the class born1
  {
    born1 b = new born1();   // An object of the class born1 has been created
    
    born1 b1;                // A variable b1 of type born1 is declared , a object has not been created yet
    
    new born11();            // an object has been created , however there is no reference to access this object
    
    
  }
   
}

class born
{
  public static void main(String aa[])
  {
    // a differente class can also create objects
    
    born1 b2 = new born1();   // An object has been created
  
  
  }

}