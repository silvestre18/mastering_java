/* Different values of an specific type can be assigned to other variables of other type , however,
   some rules must be applied */

class conversion
{
  public static void main(String aa[])
  {
    /* the first rule is to understand this list in order
      double , float , long , int , short , byte */
      
     // a byte value can be assigned to short int and so on
     // a short value can be assigned to int long and so on
     
     double a1 = 3l; // according to the list a long  value can be assigned to a double type
     float a2 = 3;   //  according to the list a int value can be assigned to a float type
     
     // int a3 = 4l;     according to the list a long value can not be assigned to a int value
     
     double a3 = 23.4f; // according to the list a float value can not be assigned to a double value
     
     
     /*********EXTRA CONCEPTS*************/
     
     // char value or literals can be assigned to int long float and double
     
     char c1 ='2';  
     double a4 = 's';  // correct
     float a5 = c1;    // correct
     
     // char values can not be assigned to short or byte
     
     // byte a6 = c1;   this is not correct
     // short a7 = c1 ;  this is not correct
     
     // char literals can be assigned to short and byte
     
     byte a6 ='d';
     short a7 = '2';
   
    
     
     
    
  }
  

}