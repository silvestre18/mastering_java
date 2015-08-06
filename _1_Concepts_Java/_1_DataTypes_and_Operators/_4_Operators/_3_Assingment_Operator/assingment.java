/*  the assignment operator is */

class assingment
{
  public static void main(String aa[])
  {
    // It should be the easiest operator, however there are some rules to notice
    
    int a1 = 3;     // this is correct , 3 is a literal integer    
    // int a2 = 3l;     this is incorrect, 3l is a long literal
    float a3 = 345;  // this is correct 
    
    /************EXTRA CONCEPTS *************/
    
    // Shorthands Assignments are += , -= , *= 
    
    // instead of using a1 = a1 +2; we can use:
    
    a1+=3; // now a1 is 7
    
    // Shorthands are used with boolean and characters as well
    
    boolean b1 = true;
    b1&=false; // this is similar to b1 = b1&false , so b1 is false
    
    char c1 ='s';
    c1-=3;     // this is similar to c1 = c1 + 3;
    
    
  
  }

}