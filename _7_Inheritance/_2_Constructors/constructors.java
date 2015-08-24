package _2_Constructors;
class constructors1
{
  constructors1()
  {
    System.out.println("constructors1");
  
  }
  void show1()
  {
    System.out.println("method1");
  
  }
  
  int a;

}

class constructors2 extends constructors1
{
  constructors2(short a)
  {
    System.out.println("constructors2");
  
  }
  
  void show2()
  {
    System.out.println("method2");
  
  }
  
  int b;

}

class constructors3 extends constructors2
{
  constructors3()
  {
    super((short)3);
    System.out.println("constructors3");
  
  }
  
  void show3()
  {
    System.out.println("method3");
    super.show2();
    super.show1();
    super.a=4;
    super.b=5;
    System.out.println(super.a+super.b);
  
  }
  
  int c;

}

class constructors
{
  public static void main(String aa[])
  {
    constructors2 c2 = new constructors2((short)3);
    constructors3 c3 = new constructors3();
    c2 =c3;
    
    c2.a=56;
    System.out.println(c3.a);


    c3.show3();
    c3.show1();
  }

}