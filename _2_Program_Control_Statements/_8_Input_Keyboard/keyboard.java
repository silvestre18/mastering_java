// This file will explain how to read characters from the keyboard
class keyboard
{
  public static void main(String aa[])
  throws java.io.IOException     // this line must be used to read characters from the keyboard
  {
    /* With this small program , many concepts of control statements plus
       how to read characters from keyboard will be explained*/

    char c1, c2, c3 = 'K';
    do{
      System.out.println("I'm thinking of a letter between A and Z.");
      System.out.print("Guess it: ");
      c1 = (char) System.in.read();
      do {
        c2 = (char) System.in.read();
      } while(c2!= '\n');
      
      if(c1 == c3) 
        System.out.println("** Right **");
      else 
      {
        System.out.print("...Sorry, you're ");
        if(c1 < c3) 
          System.out.println("too low");
        else 
          System.out.println("too high");
        System.out.println("Try again!\n");
      }
      } while(c3 != c1);
      
    /******************EXTRA CONCEPTS***********/
    // The key enter is included in the buffer when System.in.read() is used      
  }

}