/* This file will explain many methods of the class String */
class methods
{
  public static void main(String a[])
  {
  
  /*charAt
  indexOf
  lastIndexOf
  toUpperCase
  toLowerCase
  equals
  equalsIgnoreCase
  substring
  startsWith
  endsWith
  trim
  contains
  replace
  length
  compareTo
  */
  
  
  
  
    String s1 = "  Elizabeth y jim  ";
    String s2 = "jim";
    
    // length will print the amount of characters of the string
    System.out.println(s1.length());   // 19
    
    // charAt will print the char at an specific position
    
    System.out.println(s1.charAt(4));  // i
    
    // compareTo will compare which string is greater
    
    System.out.println(s2.compareTo("leonardito"));      // less than 0
    System.out.println(s2.compareTo("jim"));             // 0
    System.out.println(s2.compareTo("elizabeth"));       // more than 0
    
    // indexOf to look for the index of a char or String
    
    System.out.println(s1.indexOf('e'));    // 8
    System.out.println(s1.indexOf("j"));    // 14
    System.out.println(s1.indexOf("th"));   // 9
    System.out.println(s1.indexOf('i',8));  // 15
    
    // lastIndexOf , the same of indexOf but starting from the end
    
    System.out.println(s1.lastIndexOf('e'));    // 8
    System.out.println(s1.lastIndexOf("j"));    // 14
    System.out.println(s1.lastIndexOf("th"));   // 9
    System.out.println(s1.lastIndexOf('i',8));  // 4
    
    // substring , it will print a substring of the String
    
    System.out.println(s1.substring(4));       // izabeth y jim
    System.out.println(s1.substring(4,7));     // iza
    
    // trim will erase all the spaces
    
    System.out.println(s1.trim());        // elizabeth y jim
    
    // replace a char or String for a char or a String
    
    System.out.println(s1.replace("beth","BETH"));    //  elizaBETH y jim
    System.out.println(s1.replace('i','I'));          //  elIzabeth y jIm
    
    // startsWith and endsWith
    
    System.out.println(s1.startsWith("  "));       // true
    System.out.println(s1.startsWith(" s "));      // false
    System.out.println(s1.endsWith("  "));         // true
    System.out.println(s1.endsWith("sd  "));       // false
    
    // toLowerCase and toUpperCase
    
    System.out.println("ABCDEFGHI".toLowerCase());   // abcdefghi
    System.out.println("abcde".toUpperCase());      // ABCDE
    
    // contains  
    
    System.out.println(s1.contains("beth"));        // true
    System.out.println(s1.contains("beths"));        // false
    
    
    
    
    
    
  
  }

}