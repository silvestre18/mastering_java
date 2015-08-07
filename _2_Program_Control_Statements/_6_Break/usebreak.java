// This file will explain all the features of break
class usebreak
{
  public static void main(String aa[])
  {
    /* The keyword break can be used to force an exit from  the nearest loop */
    
    for(int i =0;i<5;i++)
      for(int j=0;j<4;j++)
      { 
        System.out.println(i+j);  
        if(j==2)
          break;                // this break will force an exit of the nearest loop
      }
    
    /* The keyword break can be used to force an exit from a label */
    
    label1:    // this is a label
      for(int i =0; i<7;i++)
        if(i==4)
          break label1;    // this break will force an exit of the label1
    
    
    // When using labels , the break must be inside the label      
          
  
  }

}