// This file will explain how different kind of variables initialize

class initialization1
{
  // Both static and instance variables , have values by default
  
  {
    a =4;
  
  }
 
  int a ;
  static int a1;
  {
  
  }

  
  
  void method1()
  {
    System.out.println(a+a1); // As it can be seen , both a and a1 have not been initialized
  
  }
  

}

class initialization
{
  public static void main(String aa[])
  {
    initialization1 i = new initialization1();
    i.method1();  // this will print the sum between the default values of a and a1    
    initialization2 e3 = new initialization2();
    e3.i1.method1();
    e3.i2 = new initialization2();
    e3.i2.method5();
  }
  
  /*Default Values
  
  byte, short,int,long - > 0
  
  float, double - > 0.0
  
  boolean - > false
  
  char - > '\u0000' 
  
  any object  - > This will be explained later
  
*/
  
  
}

/****************EXTRA CONCEPTS*****************/

// As a instance variable , an object of other class can be created

class initialization2
{
  // As a instance variable , an object of other class can be created
  initialization1 i1 = new initialization1();    // this can be created
  
  // A reference from this class without initialized can be created
  initialization2 i2 ; 
  
  // An object of this class can be created
  
  // initialization2 i4 = new initialization();  this can not be created
  void method5()
  {
    System.out.println("jim");
  
  }
  

}



