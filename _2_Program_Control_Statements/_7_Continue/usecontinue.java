/* This file will explain all the features of the keyword continue */
class usecontinue
{
  public static void main(String aa[])
  {
    /* The keyword continue can be used to force the next iteration of a loop
       without finishing the correspondent body */
    
    for (int i =0;i<5;i++)
    {
      if(i==3)
        continue;             
      System.out.print(i+ " ");  
      
      /* Because continue is executed , 3 is not printed and the result would be
        
        0 1 2 4 5   
        
      */
    }
    
    /* The keyword continue can be used to come back to the correspondent label */
    
    label1:
      for(int i =0;i<7;i++)
      {  
        if(i==4)
          continue label1;
        System.out.print(i+ " ");
       /* This will print
        0 1 2 3 5 6 7 */ 
      }
        
  
  }

}