/* This file will explain how to overload methods */

class overloading1
{
  /* Overload a methods means to have more than one methods with  the same name but
    with some other features to distinct one from the other ones */
  
  /* There are 3 rules for a correct overloading of methods */
  
  // The number of parameters accepted
  
  // Those 3 methods have different amount of arguments
  void method1 ()
  {
  }
  
  int method1(int a)
  {
   return a;
   
  }
  
  float method1(int a , int b)
  {
    return 2.3f;
  }
  
  // Change in the type of parameters accepted
  
  // Those 2 methods have differente type of arguments
  void method2 (int a , int b)
  {
  }
  
  void method2( float a, float b)
  {
  }
  
  // There can be any kind of confusion
  
  void method3(int a , double b , char c)
  {
    System.out.println("jim");
  }
  
  void method3(int a , long b , char c)
  {
    System.out.println("Elizabeth");
  }
  void method3(int a , int b , char c)
  {
  }
  
  void method4(char a)
  {}

}

class overloading
{
  public static void main(String aa[])
  {
    overloading1 o = new overloading1();
    char c=(short)4;
    o.method3(3 , 3,'+');    // method 3
    
  }
}