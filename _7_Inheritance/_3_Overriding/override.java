package _3_Overriding;
class override1
{
  override1()
  {
    System.out.println("constructors1");
  
  }
  void show1()
  {
    System.out.println("method1");
  
  }
  
  int a;

}

class override2 extends override1
{
  override2(short a)
  {
    System.out.println("constructors2");
  
  }
  
  void show1()
  {
    System.out.println("method2");
  
  }
  
  void show2()
  {}
  
  int b;

}

class override3 extends override2
{
  override3()
  {
    super((short)3);
    System.out.println("constructors3");
  
  }
  
  void show1()
  {
    System.out.println("method3");
    super.show1();

  
  }
  
  int c;

}

class override
{
  public static void main(String aa[])
  {
    override1 o1 = new override1();
    o1.show1();
    override2 o2 = new override2((short)23);
    o2.show1();
    override3 o3 = new override3();
    o3.show1();
    
    o1=o2;
    o2.show1();
    o1.show1();
    o2=o3;
    o2.show1();
    o1.show1();

  }

}