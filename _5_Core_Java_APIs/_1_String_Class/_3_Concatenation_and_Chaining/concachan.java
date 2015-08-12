/* This will explain how to concatenate and the use of chains in Strings */

class concachan
{
  public static void main(String aa[])
  {
    // The use of the operator + in Strings is special
    
    String s1 = "jim";
    
    System.out.println(false+"jim"+1);  // falsejim1
    
    // you can use multiple methods at the same time , from left to right
    
    String s2 = "AniMaL ".trim().toLowerCase().replace('a', 'A'); // AnimAL
    System.out.println(s2);
   
  }

}