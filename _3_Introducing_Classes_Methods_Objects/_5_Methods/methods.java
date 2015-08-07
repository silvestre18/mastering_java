/* This file will explain how to use methods*/

class methods1
{
  int a1=3;
  
  // A method must have a return value
  void method1()     // in this case the return value is void , so it does not return anything
  {
    System.out.println(a1);   // you can use here instance variables
  
  }
  
  // you can use return in a void method
  void method2()
  {
    if (a1==3)
      return; 
    System.out.println(a1);  // This will not appear because return was executed
  
  }
  
  // A method with a return value
  
  byte method3()
  {
    byte a2=4;
    return a2;       // this methods returns a value of the same type as when it was declared
  
  }
  
  // A method with parameters
  
  void method4(int a3, char a4)  // here the parameters are a3 and a4
  {
    System.out.println(a3+a4);
  
  }

}

class methods 
{
  public static void main(String aa[])
  {
    // To use the methods we have to create objects first
    
    methods1 m = new methods1();
    
    m.method1();                     // this is how methods are used
    m.method2();
    
    System.out.println(m.method3()); // m.method3() returns a value 
   
    m.method4(5,'8');                 // Like this is how parameters are added
    
  
  }

}