/* This file will explain an amount of methods used with StringBuilder */

class methods
{
  public static void main(String aa[])
  {
    StringBuilder sb1 = new StringBuilder("Elizabeth y Jim");
   
    // There are 4 methods used with string which can be used with StringBuilder
    
    // charAt , indexOf , substring , length
    
    System.out.println(sb1.charAt(4));        // a
    System.out.println(sb1.indexOf("i",7));   // 13
    System.out.println(sb1.length());         // 15
    System.out.println(sb1.substring(5,9));   // beth
    
    
    
    
    /*
    append
    delete
    deleteCharAt
    subSequence
    toString
    insert
    replace
    reverse
    
    */
    
    
    
    
    // append
    
    System.out.println(sb1.append(" y leonardito")); 
    
    // insert
    
    System.out.println(sb1.insert(5,"milagrito"));
    
    // delete
    
    System.out.println(sb1.delete(4,12));
    
    // deleteCharAt
    
    System.out.println(sb1.deleteCharAt(3));
    
    // reverse
    
    System.out.println(sb1.reverse());
    
    // toString
    
    String s1 = sb1.toString();
    
    // replace
    
    System.out.println(sb1.replace(2,6,"teffy"));
    
    // subsequence
    
    System.out.println(sb1.subSequence(2,9));
  
  }

}
