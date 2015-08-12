/* This file will explain how to create Strings */
class create
{
  public static void main(String aa[])
  {
    // First of all , strings are objects according to JAVA
    
    // There are many ways to create String objects
    
    String s1 ="jim";     
    String s2= new String();         // It is creating an empty string
    String s3 = s1 ;                 // both s3 and s1 are pointing to the same adress
    String s4 = new String ("jim");
    System.out.println("Jim");       // Here an object is created as well
    
    char c1[] ={'j','i','m'};       // this is an array and now it is not importante
    String s5 = new String(c1);      // Another way of creating a String
    
    StringBuilder sb1 = new StringBuilder("jim");  
    String s6 = new String(sb1);
    
    // When using == in String , what it is compared is the adress nor the value
    
    System.out.println(s1==s4);  // false , despite that both have the same value
    
    // There are two general ways to create String objects 
    
    // From String pool
    
    String s7 = "Elizabeth" ;         // We are using the String pool
    System.out.println("Elizabeth");  
    
    // Using the keyword new
    
    String s8 = new String ("Elizabeth");
    
    System.out.println(s7 == s8);         // false
    System.out.println(s7=="Elizabeth");  // true
    
    
    /*************EXTRA CONCEPTS***************/
    
    // Because a String is an object , it can be assigned null;
    
    String s9 = null;
    
    System.out.println(s9); // It will print null
  
  }

}