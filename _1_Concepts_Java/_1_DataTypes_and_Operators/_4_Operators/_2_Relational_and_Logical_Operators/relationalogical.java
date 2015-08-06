/* relational operators are == , != , < , > , <= , >= 
   logical operators are ! , & , | , ^ , || , &&
*/

class relationalogical
{
  public static void main(String ... aa)
  {
    /* Relational operators have as results boolean values */
    
    boolean a1 = 3 == 4;   // false ;because 3 is different than 4
    boolean a2 = 4 != 5 ;  // true ; because 4 is different than 5
    boolean a3 = 4 < 3.2 ; // false ;because 4 is greater than 3.2
    

    /* Logical operators have as results boolean values , however the operands
      are boolean values as well */
    
    boolean a4 = !(4<3.2);       // true ; (4<3.2) is false and !false is true
    boolean a5 = true & (3==4);  // false; (3==4) is false and true & false is false
    boolean a6 = false | true ;  // true 
    boolean a7 = false ^ false ; // false
    
    /**************EXTRA CONCEPTS************/
    
    /* & is the and operator , | is the or operator , ^ is the xor operator
      ! is the negation operator , so these operators fulfill the rules of
      logic */
    
    /* Short-circuit logical operators are || and && , they act as the normal
      | and & ,however , if the first operand is enough to know the final result,
      the second operand will not be evaluated */
      
      boolean a8 = false && (3<4);  // this is false , however (3<4) was not evaluated
      
    /* a compile error will appar if we try to use relational and logical operators with
       different types of operators */
      
      // boolean a9 = 3 < true;  this will not compile 
       
  }

}