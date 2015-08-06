/* This file will explain how to initialize primitive types */
class initialize
{
  public static void main(String args[])
  {
    /* Any variable can be used without having been initialized first
      and the correct value or literal must be assigned to he correct type of
      variable */
    
    // INTEGERS
    
    int a1 = 23; // this is correct because 23 is an int literal
    // int a2 = 23.4    this would be incorrect because 23.4 is a double literal
    
    // int a3 = 34l;    this would be incorrect because the l transform 34 in a long literal
    
    // CHARACTERS
    // int literals can be assigned to char variables
    
    char b1 = 4; // in this case b1 is not '4' ,it is the unicode represented by the number 4
    
    /****************EXTRA CONCEPTS ****************/
    
    // One thing is to initialize variables with literals , and other is to do it with other variables
    
    int a2 =4;       // this is correct
    int a3 = a2;     // this is correct because a2 is an int
    
    // However , when doing this new rules appear
    
    short a4 = 45;    // this is correct , despite 45 is an int literal , it can be assigned to a short variable   
    /* short a5= a3 ;  this is incorrect , only int literals can be assigned to short or byte types 
                       a3 is not a literal , is another variable*/
     
    long a5 = a3;    // this is correct , because long type are bigger than int type
    
    // The same occurs for CHARACTERS
    
    // char b2 = a3    this is incorrect , because int type is bigger than char types
    // the char type can not be assigned wit integer variables                    
    
    /*************** FINAL EXTRA CONCEPTS ****************/
    
    // Integer types can be assigned with char constants and variables
   
    byte a6='2';         // a character can be assigned to a byte
    // byte a7 = b1;     this is incorrect because a char type is bigger than a byte type
 
    short a7='2';       // a character can be assigned to a short
    // short a8 = b1;   this is incorrect 
    
    int a8='2';        // a character can be assigned to an int
    int a9 = b1;        // a variable char can be assigned to an int

    long a10='2';  // a character can be assigned to a long
    long a11 = b1; // a variable char can be assigned to a long
    
    // It is known that the standard UNICODE is used in char type so:
    
    char b2 = '\uf302'; // this is valid , from \u0000 till \uffff ara valids
    
    // you can not assigne a negative literal to a char
    
    // char b3 = -123 ;   this is incorrect
    
    
    
    // To save space when declaring variables , a comma is useful
    
    int a12 =23, a13, a14, a15=a8, a16=56; // those variables can be assigned in a same line

    
    
    


  
  }

}