package _6_Interfaces;

interface interfac1
{
  void method1();

  int a=3;
  
}

interface interfac2
{
  void method2();
  int b=3;

}

class interfac3 implements interfac1,interfac2
{
  public void method1()
  {
    System.out.println("method1");
  
  }
  
  public void method2()
  {
    System.out.println("method2");
  
  }
  
  void method3()
  {
    System.out.println("method3");
  
  }
  
}

interface interfac4
{
  void method4();

}

interface interfac5 extends interfac4
{
  void method5();
}

interface interfac6
{
  void method6();
  default void method66()
  {
    System.out.println("method66");
  
  }
  
  static void method666()
  {
    System.out.println("method666");
  
  }

}

class interfac7 implements interfac6
{
  public void method6()
  {
    System.out.println("method6");
  }
  static void method666()
  {
    System.out.println("method6666");
  
  }

}

class interfac
{
  public static void main(String aa[])
  {
    interfac3 i3 = new interfac3();
    i3.method1();
    System.out.println(interfac3.a+interfac3.b);
    interfac2 i2;
    i2 = i3;
    i2.method2();
    
    interfac7 i7 = new interfac7();
    i7.method6();
    i7.method66();
    interfac6.method666();
    i7.method666();
   
  
  }

}