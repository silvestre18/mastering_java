/* This file will explain the features of StringBuilder */

class stringbuilder
{
  public static void main (String aa[])
  {
    // There are 4 forms to create a StringBuilder
    
    StringBuilder sb1 = new StringBuilder();  // an object with capacity of 16
    StringBuilder sb2 = sb1; // remember that those are objects
    StringBuilder sb3 = new StringBuilder("Elizabeth");  // Similar than string
    StringBuilder sb4 = new StringBuilder(20);  // an object with capacity of 20
    
    // the keyword null can be equaled to a StringBuilder
    
    StringBuilder sb5 = null;
    StringBuilder sb6;
    
    // As a main difference between StringBuilder and String , a StringBuilder can not be
    // added a boolean , numeric or char
    
    // System.out.println(sb5+3);  this will be incorrect
    
    // However you can add a String
    
    System.out.println(sb5+"jim");   // nulljim
  
  }

}