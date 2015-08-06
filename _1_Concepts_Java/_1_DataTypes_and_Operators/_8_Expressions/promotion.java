/* The concept of promotion is very quite important to understand how literals , values and
   variables are mixed to create a new result and the type of it */

class promotion
{
  public static void main(String aa[])
  {
    /* Promotion is applied when there are more than 2 operators 
    
    char byte and short are promoted to int
    if there is a long , the result value will be a long
    if there is a float , the result value will be a float
    if there is a double , the result value will be a double
    
    */
    byte a1 = 4;
    short a2 = 2;
    char c1 = '3';
    
    //  byte a3 = a1*2 ;  this is incorrect, because the result will be an int
    int a3 = a1+a2+c1; // this is correct, because the result will be an int  
    //  int a4 = 3l +a2;  this is incorrect, because the result will be a long
    double a4 = 3l + (short)a3 + 23.4; // this is correct because the result will be a double
    
    /*************EXTRA CONCEPTS***********/
    
    boolean b1 = 5 ==5.0;  // the result is true
    
    boolean b2 = 34.34 ==34.34f; // the result is false


   
  }


}