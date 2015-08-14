/* This file will explain the use of bitwise operators */

class bitwise
{
  public static void main(String aa[])
  {
    // & ^ | are used for chat byte short int long 
    // Every number has a representation in binary with bits
    
    byte a1 =4;
    short a2 = 7;
    
    int a3 = a1&a2;
    
    // shift operators are >> << >>>
    
    // << moves n bits to the left , adding a zero to the rightmost position
    
    int a4 = 8<< 3;
    
    System.out.println(a4);
    
    // >> moves n bits to the right , if the value is positive , it adds 0s to the left , otherwise adds 1
    
    int a5 = a1>>3; // it moves 3 bits to the right
    int a6 = -23>>4;
    
    System.out.println(a5 + " " + a6);
    
    // >>> , it always add zeros no matter whether is negative or positivie
    
    int a7 = -234>>>3;  // moves 3 bits to the right adding zero
    
    System.out.println(a7);

    
    
  
  }

}