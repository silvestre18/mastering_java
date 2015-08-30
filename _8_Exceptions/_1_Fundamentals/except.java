/* All of the exceptions are subclasses of Throwable , there are tow principal subclasses
   Error which are out of our control and Exception , a subclass of Exception is RuntimeException */

class except1
{
  static void method1()
  {
    int a[] = new int [4];
    a[4]=45;
  
  }
  
  static void method2()
  {
    try
    {
      throw new ArithmeticException();
    
    }
    
    catch (ArithmeticException e1)
    {
      throw new ArrayIndexOutOfBoundsException();
    
    }
  
  }

} 

class myexception extends Exception
{
  int a;
  int b;
  myexception(int a ,int b)
  {
    this.a =a;
    this.b =b;
  
  }
  
  public String toString()
  {
    return ""+(this.a+this.b);
  
  }


}

class except
{
  public static void main(String aa[])
  throws java.io.IOException
  {
    try
    {
      throw new myexception(4,5);
    
    }
    
    catch ( myexception e1)
    {
      System.out.println("jim18");
      System.out.println(e1);
    
    }
    
  
  
    try
    {
      int b[] = new int [5];
      b[0]= 5/0;
      b[1]= 34;
      except1.method1();
      
    } 
    catch (ArrayIndexOutOfBoundsException e1)
    {
      System.out.println("EXCEPTION");
    
    }
    
    catch (ArithmeticException e2)
    {
      System.out.println("Arithmetic");
    
    }
    
    catch (Throwable e3)
    {
      System.out.println("THROWABLE");
    
    }
    try
    {
      int a = 23/0;
    
    
    }
    
    catch ( ArithmeticException e2)
    {
      System.out.println("Exception");
    
    }
    
    int c [] = {0,3};
    try
    {
      for (int i =0;i<c.length;i++)
      {
        try
        {
          int b = 10/c[i];
          System.out.println(b);
      
        }
        catch( ArrayIndexOutOfBoundsException e1)
        {
          System.out.println("out");
      
        }
      }
    
    }    
    
    catch( ArithmeticException e2)
    {
      System.out.println("Arithmetica");
    
    }
    
    try
    {
      throw new ArithmeticException();
    
    }
    
    catch (ArithmeticException e1)
    {
      System.out.println("jim");
    
    }
    
    try 
    {
      except1.method2();
    
    }
    
    catch( ArrayIndexOutOfBoundsException e4)
    {
      System.out.println("elizabeth");
    
    
    }
    
    
    finally
    {
      System.out.println("final");
    
    }
    
    
     
  
  }


}
   