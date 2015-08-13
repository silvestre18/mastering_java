/* This file will explain everything about arrays */

import java.util.Arrays;            // This will be used to use some methods for arrays

class arrays
{
  public static void main(String aa[])
  {
    // Create one-dimensional arrays
    
    int a [] = new int[4];   /// an array of 4 elements
    int [] a1 = new int[4];   // an array of 4 elements
    
    char [] c,c1;             // two array
    
    int a2[] = new int []{7,4,5};  // an array of 3 elements
    
    String s1[] = new String[4];    // all the 4 elements are null
    
    // Create multidimensional arrays
    
    int a3 [][] = new int [3][4];   // 3x4 arrays
    int []a4[] = new int [4][5];    // 4x5 arrays
    int [][]a5[] ={{{2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6}},{{7,8,9},{0,1,2},{3,4}}};
    
    System.out.println(a5[2][1][1]);  // 1
    System.out.println(a5[0][1][1]);  // 5
    
    // Methods using in arrays
    
    // length
    int a6[] = new int [4];
    System.out.println(a6.length);    // 4
    
    //sort
    Arrays.sort(a2);
    System.out.println(a2[2]);        // 7
    
    //binarySearch
    
    System.out.println(Arrays.binarySearch(a2,4));


  
  }

}