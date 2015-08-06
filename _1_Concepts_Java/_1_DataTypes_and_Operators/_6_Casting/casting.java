/* Automatic conversion is not useful when trying to pass from a larger type to a
  shorter one , that is the reason why casting exist */
class casting
{
  public static void main(String aa[])
  {
    // int a = 3.4/2;    this is not correct because 3.4 is a double literal
    
    int a1 =(int)3.4/2;   // this is correct because we are casting 3.4 to an int
    
    // Normally when casting , values loss , (int)3.4 will become 3
    
    char c1 ='2';
    
    // short a2 = c1;   this is not correct
    short a2 = (short)c1;  this is correct
    
    /*************EXTRA CONCEPTS**************/
    
    // boolean type can not be casted 
    
  }

}