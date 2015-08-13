/* This file will explain the use of varargs */

class varargs
{
  void method1(int a , int ...b)    // this is the use of varargs
  {
    System.out.println(b.length);
  
  }
  
  /* void method(int ... c, d)  this is not allowed , the vararg must be at the end of the parameters
    {
    }
    
    void method(int ...s, char ...s) this is not allowed , only one vararg per method
  
  
  
  */
  public static void main(String ...a)
  {
    varargs v = new varargs();
    v.method1(3,4,5,6);    // It will print 3
  
  }

}