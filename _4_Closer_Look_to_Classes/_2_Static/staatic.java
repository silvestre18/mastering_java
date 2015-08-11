/* This file will explain everything about the keyword static */

class staatic
{
  // When applied the keyword static to a variable , it become to a variable of the class
  
  static int a; // this becomes a variable of the class staatic
  
  // When applied the keyword static to a method :
  
  
  public static void main(String aa[])
  {
    a = 4;
    System.out.println(a);   // the method main belongs to the same class as a 
    
    staatic1.a1=5;                    // if a static variable belongs to another class
    System.out.println(staatic1.a1);  
    
    staatic1 s = new staatic1(); // An object of the class staatic1
    
    System.out.println(s.a1);   // An static variable can be called like this as well 
    
    s.method1();            // a static method can be called like this or
    staatic1.method1(); 
    staatic2 s1 = new staatic2();
    staatic2 s2 = new staatic2();

  }



}

class staatic1
{
  static int a1;      // this becomes a variable of the class staatic1
  
  static void method1()
  {
    System.out.println("Static method");
  
  }
 
}

/**************EXTRA CONCEPTS*************/


class staatic2
{
  staatic2()
  {
    System.out.println("constructor");
  
  }

  // A non-static method can have inside static variables and methods
  
  static int a2;
  
  static void method3()
  {
    System.out.println("static method from staatic2");
  
  }

  void method2()
  {
    a2 =5;
    System.out.println(a2);
    method3();
  }
  
  // A static method can have inside only static variables and methods
  
  int a3;
  
  static void method4()
  {
    // method2();   this is incorrect because method2() is non-static
    method3();    // this is correct
    // a3 =5;       this is incorrect because a3 is non-static
  
  }
  
  // A non-static variable can be equaled to any static variable or method
  
  static int method5()
  {
    return 'd';
  
  }
  
  int a4=method5();    // this is correct
  
  // A static variable can only be equaled to static variables or methods
  
  static float method6()
  {
    return 23.4f;
  
  }
  
  static float a5=method6();   // this is correct
  
  /*****************EXTRA FINAL CONCEPTS****************/
  
  // Static blocks can be used only for static variables or methods , and it will be initialized first than
  // any constructor and only once
  
  

  {
    System.out.println("Second");
  
  }
  static
  {
    System.out.println("First of all");

  }
  
  {
    System.out.println("Third");
  
  }
  
  

}

