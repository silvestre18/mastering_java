/* This file will explain how to use equals */

class equality
{
  public static void main(String aa[])
  {
    // The use of == compare address , but the use of equals compare values
    
    String s1 = "Elizabeth";
    
    System.out.println(s1.equals("Elizabeth"));               // true
    System.out.println(s1.equalsIgnoreCase("elizabeth"));     // true
  
  }

}