/* This file will explain how to create objects */

// A file can have more than one class

class creation1     // Notice that this class does not have the same name of the file
{
  // Notice that this class will not have a main method
  
  int a1;           // An instance variable
  
  int method1()     // A method
  {
  }
  
  creation1()       // A constructor
  {
  }


}

class creation      // Notice this class has the same name of the file , because of having the main method
{
  public static void main(String ...a)  // the main method is here
  {
    /* This is how a object is created */
    
    creation1 c1 = new creation1();   
    /* first we write the name of the class from we want to create an object
       then the name of the reference to the object
       then =
       then the keyword new
       finally the constructor
       */
    
    creation1 c2 = new creation1();  // this is the creation of another object of the class creation1 
    
    creation c3 = new creation();   // this is the born of an object of the class creation
    
    /**********NOTES**************/
    
    // Many objects can be created from a single class 
  
  
  }
  
}