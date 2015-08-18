/* This file explains features about wrapper classes */
import java.util.ArrayList;
class wrapper
{
  public static void main(String aa[])
  {
    Integer ii1 = Integer.valueOf("123");
    
    float ff1 = Float.parseFloat("23d");
    
    float ff22= Float.valueOf(23);

  
  
    // there are 8 functions every wrapper class must have
    // first function
    Byte b1 = new Byte((byte)345);
    Short s1 = new Short((byte)123);    // byte as well
    Integer i1 = new Integer ((short)123);      // byte , short , char as well
    Long l1 = new Long(1234);           // byte , short , char , int as well
    Float f1 = new Float(12.);          // even double 
    Double d1 = new Double (23d);      
    Boolean bo1= new Boolean(true);
    Character c1 = new Character('s');   // only char
    
    // second function
    
    Byte b2 = new Byte("123");
    Short s2 = new Short("123");
    Integer i2 = new Integer("1234");
    Long l2 = new Long("1234l");
    Float f2 = new Float("12d");
    Double d2 = new Double("12.3");
    Boolean bO2 = new Boolean("tRUE");
    
    // third function
    
    byte b3=b1;
    short s3 =b1;
    int i3 = c1;
    long l3 = c1;
    float f3 = l2;
    double d3 = f2;
    boolean bo3 = bO2;
    char c3= c1;
    
    // fourth function
    
    Byte b4 = (byte) 23;
    Short s4 = (byte)234;
    Integer i4 = 234;
    Long l4 = 123l;
    Float f4 = 34f;
    Double d4 = 34d;
    Boolean bo4 = true;
    Character c4 = 4;  
  }
}