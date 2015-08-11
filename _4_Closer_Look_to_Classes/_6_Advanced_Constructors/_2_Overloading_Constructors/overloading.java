/* This file will explain overloading constructors */

class overloading
{
  // Overload constructors follow the same rules as methods
  overloading(int a )
  {
    a=5;
    System.out.println(a);
  
  }
  
  overloading(double b)
  {
    b=5;
    System.out.println(b);
  
  }
  
  // You can call an overloaded constructor using this();
  
  overloading()
  {
    this(3.4);
  
  }
  
  
  public static void main(String aa[])
  {
    overloading o = new overloading();
  
  }

}