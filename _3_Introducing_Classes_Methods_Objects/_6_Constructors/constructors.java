/* This file will explain how to use simple constructors */

class constructors1
{
  // A constructor is like a method , without a return value and with the same name as the correspondent class
  // A constructor can also have parameters
  
  int a1;
  constructors1(int a2 , char b1)
  {
    a1 =23;
    System.out.println(a1 +a2 +b1);
  
  }
  

}

class constructors
{
  public static void main(String aa[])
  {
    // a constructor is executed when an object is created
    
    constructors1 c = new constructors1(23,'e'); // the body of the constructor is executed when creating an object
  
  }


}