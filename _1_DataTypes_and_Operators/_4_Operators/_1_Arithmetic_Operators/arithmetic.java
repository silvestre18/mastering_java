/* The main arithmetic operators are + , - , * , / , % , ++ , -- */

class arithmetic
{
  public static void main(String aa[])
  {
    // + - * / , the use of this operators is the easiest , it is like doing math
    
    int a1 = 3 + 4 * 3;  // 15 , obviously yo have to start with * , as ia said it is simple math
    
    long a2 = 3 / 4 +1;  // 1 ;  3/4 is 0 because the division between integers is truncated
    
    int a3 = (27 /5) ;     // 5 ,  again the division between integers truncated
    
    double a4 = (27 /5 ); // 5.0 
    
    double a5 = 27.0/ 5.0 ; // 5.4 , now it is a division between floating-point numbers
    

    /* Division between integer types results an integer , a division between floating-point types
     result a double , division between integer an floating-point types is a double as well */
    
    
    // % , the remainder operator is applied to integer and floating-point types
    
    double a6 = 34% 2.3;     // 1.800000025 
    int a7 = 9%2;            // 1
    
    
    // ++ -- , these are special arithmetic operators , can be used for integer and floating-point types
    
    a6++; // now a6 is 2.8000000025
    ++a6; // now a6 is 3.8000000025
    --a6; // now a6 is 2.8000000025
    a6--; // now a6 is 2.8000000025
    
    /* As simple statements ++ and -- add and substrate on to a variable , however ,
      in a expression both act in different ways */
      
    int a8 = a1++ + ++a1 - a1-- + --a1; // 30
    
    /* first   15 + ++a1 - --a1 + a1-- ; now a1 is 16
       second  15 + 17 - a1-- + --a1;    now a1 is 17
       third   15 + 17 - 17 + --a1;      now a1 is 16
       fourth  15 + 17 - 17 + 15 ;      
   */
    
    /************EXTRA CONCEPTS*****************/
    
    char c3 = 'd';
    c3++;  // this is valid too
    
    
    

    
    
  
  }


}