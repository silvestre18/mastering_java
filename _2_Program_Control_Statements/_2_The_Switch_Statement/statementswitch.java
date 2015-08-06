/* This file will explain all the features of the switch statement*/
class statementswitch
{
  public static void main(String aa[])
  {
    /* A simple switch statement*/
    
    int a1 =3;
    
    switch (a1)      // In braces we will write what we are going to compare
    {
      case 3:                                       // After case we will write the first comparator
        System.out.println("This will appear");
        break;                                      // the break is used to finish with the current case
      case 4:
        System.out.println("This will not appear");  
        break;
      case 5:
        System.out.println("This will not appear");
        break;
      default:                                      // the default case is like the last else
        System.out.println("This will not appear"); 
    
    }
    
    
    
    /* Body of cases */
    // It is not mandatory for case to have a body
    
    int a2=4;
    
    switch (a2)
    {
      case 2:
        System.out.println("This will not appear");
        break;
      case 3:                                       // case 3 does not have a body
      case 4:
        System.out.println("This will appear");
        System.out.println("This will appear too");   // there can be more than one statement
        break;
      default:
      
    
    } 
    
    
    
    /* Arguments passed to a switch statement */
    // the argument in the switch can not be float , double , long nor boolean
   
    /* 
    double c1 =5;
    switch(c1)        // this is incorrect
    {
    .
    .
    .
    }
    
    float c2 =23.4;    // this is incorrect
    switch(c2)
    {
    .
    .
    .
    }
    
    long c3 =23;        // this is incorrect
    switch(c3)
    {
    .
    .
    .
    }
    
    boolean c4 = true;   // this is incorrect
    switch(c4)
    {
    .
    .
    .
    }
    
    */
    
    
    
    /* Values passed to the label case */
    // If we are going to pass a variable , it must be final and initialized when declared
    

    
    final int a3 = 45;
    
    switch(45)
    {
      case a3:                                  // this is correct because a3 is final and initialized when declared
        System.out.println("This will appear");
    
    }
    
    
    /*
    final int a3;
    a3=45;
    
    switch(45)
    {
      case a3:                                     // this is incorrect because a3 was not initialized when declared
        System.out.println("This will not appear");
    
    }
    
    */
    
    
    
    /*
    int a3 = 45;
    
    switch(45)
    {
      case a3:                                  // this is incorrect because a3 is not final 
        System.out.println("This will appear");
    
    }
    
    */
    
    
    
  
  }


}