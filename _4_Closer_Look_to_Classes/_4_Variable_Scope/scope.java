/* This file will define the different kind of scope of variables */

class scope
{
  // There are 4 types of scope
  
  /* Local Variable is the variable defined inside a method or a block */
  
  void method1()
  {
    int a1=4 ;    // this is a local variable and it can be used only inside method1
    
    if( a1==4)
    {
      int a2;                 // this is a local variables used only inside if
      System.out.println(a2);
    
    }
  
  }
  
  /* Parameter methods are the arguments in a method , and those can be only used inside the correspondent method*/
  
  void method2(int a, int b)
  {
    a=4; b=5;
    System.out.println(a + b); // a and b can only be used inside this method
  
  }
  
  /* Instance variables can be used while an object is accessible */
  
  int a3 =5;   // this is an instance variable
  
  /* Class variables are the static ones */
  
  static int a4 =6;  // this is a classvariable
  
  
  

}