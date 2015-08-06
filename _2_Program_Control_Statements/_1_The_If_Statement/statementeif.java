/* This file will explain all the features of the if statement */

class statementif
{
  public static void main(String aa[])
  {
    /* First of all we will introduce System.out.println() which works printing what
       it is inside the braces in the console */
    
    System.out.println("My first line") ; // this will print in the console "My first line"
    
    /* Simple statement if*/
    // Inside the braces of an if there must be a boolean value , and whether it is true
    // the body of the if will be evaluated , otherwise nothing will happen 
    
    if( 3<5)  // this value is true
      System.out.println(" 3 is less than 5 "); // the body will be evaluated
    
    if(false) // this value is false
      System.out.println("This will not appear"); // the body will not be evaluated
    
    
    
    /* Simple statement if - else */
    // If there is an else and the value of the condition in if is false , the body of 
    // else will be evaluated
    
    if(4<3)   // this is false , so the body of this if will not be evaluated
      System.out.println("This will not appear");
    
    else 
      System.out.println("4 is not greater than 3"); // this body will appear
    
    
    
    /* if - else - if ladder */
    // This kind of if will be used when having many options
    
    int a1 =45;
    
    if(a < 45 )     // false
      System.out.println("This will not appear");
    
    else if( a==45)  // true
      System.out.println(a + " is 45 ");
    
    else            //false
      System.out.println("This will not appear");
      
    
    
    /* Missing else blocks */
    // There are many errors because of missing else blocks
    
    /* if(3 <5)
       else
         System.out.println("3 < 5");
         
    this is a mistake , else can not have a body if its respective if does not have one
    
    */
    
    if(3<5);  // An if might not have a body , ; must be used in those cases
    
    
    
    /* The use of {} */
    // if more than one statement the body of an if or else has , braces must be used
    
    if (3<5)
    { 
      System.out.println("This will appear");
      System.out.println("3 < 5");
    }
    
    else
    { 
      System.out.println("This will not appear");
      System.out.println("3 < 5");    
    }
    
    
    
    /*****************EXTRA CONCEPTS*****************/
    // Be careful when there are lots of ifs and elses
    // When there is not indentation , it could be hard to notice the real code
    
    /*
    int a2=250;    
    if (a2 > 200)
    if (a2 < 400)
    if (a2 > 300)
    System.out.println("one");
    else
    System.out.println("two");
    else
    System.out.println("three");
    */
    
    // With a correct indentation it will not be hard to notice real code , however
    // it does not mean that the former code was wrong
    
    int a2 = 250
    if (a2 > 200)
      if (a2 < 400)
        if (a2 > 300)
          System.out.println("one");
        else
          System.out.println("two");
      else
        System.out.println("three");
    
    
    

    
    
    
         
      
      
      
  }

}
