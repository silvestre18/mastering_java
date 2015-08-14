import java.util.*;

/* This file will explain the use of for enhanced */
class enhanced
{
  public static void main(String aa[])
  {
    /* This is an alternative use of the for loop , there must be an 
       array , list or something that collects elements */
       
    ArrayList <StringBuilder> sbal = new ArrayList<>();
    sbal.add(new StringBuilder ("jim"));
    sbal.add(new StringBuilder ("elizabeth"));
    sbal.add(new StringBuilder ("leonardito"));
    sbal.add(new StringBuilder ("milagrito"));
    sbal.add(new StringBuilder ("tefi"));
    sbal.add(new StringBuilder ("ra"));
    
    for(StringBuilder sbal1 : sbal)
      System.out.println(sbal1.append(18));
    
    System.out.println(sbal);
    
    // Multiple for enhanced
    
    int [][][]a1={{{1,2,3},{4,5},{6}},{{7,8}},{{9,10,11},{12,13,14,15}}};  
    
    for(int a2[][] :a1)
      for( int a3[]:a2)
        for(int a4 : a3)
          System.out.println(a4);
  }

}