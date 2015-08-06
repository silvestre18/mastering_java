/* literals are human-readable fixed values which are assigned to variables */
class literals
{
  public static void main (String ...a)
  {
    /* Character literals
      Characters between '' are literals for char value
      */
     
     char c1 ='3';
     char c2 = '+';
    
    /* Boolean literlas
      There are only two boolean literals true and false
      */
      
     boolean b1 = true;
     boolean b2 = false;
     
    /* Integer Literals
     An integer literal does not have the point decimal (34, 45, -56)
     By default all the integer literals are of type int, however , 
     those ones can be assigned to byte short and long types */
     
     byte a1 = 23 ; // 23 is a literal which by default is int , however , it can be assigned to a byte type
     short a2 = -45 ; // -45 is a literal which by default is int , however , it can be assigned to a short type
     int a3 = 2345 ; // 2345 is a literal which by default is int 
     long a4 = -23 ; // -23 is a literal which by default is int , however , it can be assigned to a long type
     
    /* Floating-Points Literals
     A floating-point literals has the point decimal ( 23.4 , -23.4)
     By default all the floating-point literals are of type double */
     
     // float a5 = 12.3 ;  this would be incorrect because 12.3 is a double literal
     
     double a5 = 12.3; // 12.3 is a double literal
     
    /************ EXTRA CONCEPTS **************/
    
    /* It is possible to add and l or L at the end of a literal int , and this will become
       a long literal , and it will only be able to be assigned to long variables */
       
     long a6 = 23546275346723l; // this is advisable to use when the number overpass the limit of an int value
    
    /* If you want to use a float type , you must add an f or and F at the end o the double literal 
      and it will become a float literal */
      
     float a7 = -14.6f; // now -14.6 has become a float literal
     double a8 = 14.9f; // float literals can be assigned to double types as well
     float a9 = 23;
     double a10 =-35;  // int literals can be assigned to float and double types 
    
    /* Hexadecimal , octal and binary literals can be assigned to Integer types like byte , short , int and long */
    
     int a11= 0b1011;    // this is a binary literal and it must begin with 0b or 0B
     short a12 =07263;   // this is a octal literal and it must begin with 0
     long a13 = 0xfea3d; // this is a hexadecimal literal and it must begin with 0x
     
     // when printing int the console ,they will appear as decimal numbers
     
    /* It is posible to use underscores in numeric literals without altering the value */
    
    int a14 = 12_23; // the value remains being 1223
    // int a15 =_12; the underscore can not be at the beginning nor the end 
    
    // for literals which have other symbols besides numbers like . l f b x , an underscore can not ber next to them   
    
    float a15 = 1_2.4f; // this is correct
    // float a16 = 12_.4f; // this is incorrect
    // there can be more than one underscore in literals
    
    int a16 = 12_345_5; // this is correct
    
    /************* FINAL DETAILS *************/
    
    // D and d can be added at the end of numeric literals , but it will be redundant
    
    double a17 = 12.3d; // it is redundant because by default 12.3 is a double literal
    
    // Scientific notation can be used as well
    
    double a18 = 1.2e-2; // this is valid
    
    // you can mix underscores with suffixes and prefixes without problem
    
    float a19 = 1.32_3e-4f;  // this is valid
    
    double a20 = 0b1_11l;   // this is valid  
    
    
    /************* EXTRA FINAL DETAILS **********/
    
    /* Some character escape sequences */
    
    System.out.println("first line \n second line ");
    /* this will print 
     first line
      second line*/
    
    System.out.println("a\tb\c\nd\te");
    
    /* this will print
     a    b    c
     d    e
    */
     
  }
}
