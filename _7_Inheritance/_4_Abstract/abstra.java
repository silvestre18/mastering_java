package _4_Abstract;
abstract class abstra1
{
  abstra1()
  {
    System.out.println("constructors1");
  
  }
  abstract void show1();
  
  int a;

}

abstract class abstra2 extends abstra1
{
  abstra2(short a)
  {
    System.out.println("constructors2");
  
  }

  int b;

}

class abstra3 extends abstra2
{
  abstra3()
  {
    super((short)3);
    System.out.println("constructors3");
  
  }
  
  void show1()
  {
    System.out.println("method3");
    
  }
  
  int c;

}

abstract class abstra4
{
}

class abstra
{
  public static void main(String aa[])
  {
    abstra1 a1;
    abstra3 a3 = new abstra3();
    a1=a3;
    System.out.println(a1.a);
    a3.show1();
  }

}