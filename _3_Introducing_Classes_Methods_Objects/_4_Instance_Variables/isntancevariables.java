/* This file will explain how to use instance variables */

class instancevariables1
{
  /* All of these are instance variables */
  int a1; 
  int a2 =4;      // It is possible to add a value to an instance variable when declared
  double a3=23.4;
  boolean b1 ;

}

class instancevariables1
{
  public static void main(String aa[])
  {
    // To access to the instance variables of a class first we have to create an object
    
    instancevariables1 i = new instancevariables1();
    
    i.a1=45;                  // now we set 45 to the value a
    System.out.println(i.a1); // this is how we use a instance variable
    
    System.out.println(i.a2+i.a3); 
    
    i.b1=true;
    
    System.out.println(i.b1);
    
  
  
  }
  

}