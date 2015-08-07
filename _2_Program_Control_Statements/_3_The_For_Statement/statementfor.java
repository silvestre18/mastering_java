/* This file will explain all the features fo the for statement */
class statementfor
{
  public static void main(String aa[] )
  {
    /* A simple example of te use of for */
    
    for (int i =0; i<10;i++)   // from i =0 until 9
      System.out.print(i+" ");   
    /* This will print 
       0 1 2 3 4 5 6 7 8 9
    */
    
    
    /* Some variations of the for */
    
    for( int i =0,j=10 ; i<j ; i++ , j--) // It is possible to initialize more than one variable
      System.out.print(i+j+" ");
    /* This will print 
       10 10 10 10 10 
    */
    
    System.out.println();    // this is used to leave a line in blank
    
    // There can be some missing pieces of the for
    
    int i ;
    for( i=0; i<5;)          // the variable i has already been initialized and the update is not written
    {
      System.out.print(i);
      i++;                   // this statement can replace the i++ in the for
    
    }
    
    System.out.println();
    /////////////////////////////////////////////////////
    
    int j =0;
    for(;j<5;)    // j has been initialized
    {
      System.out.print(j);
      j++;
    }
    /////////////////////////////////////////////////////
    
    // this will form an infinite loop
    
    /*
    for(;;)   this forms an infinite loop
    {
    .
    .
    .
    }    
    */
    
    // As in if statements , there can be for with no loops
    
    for(int k =0;k<5;k++);   // there is no body for the for
    
  }

}