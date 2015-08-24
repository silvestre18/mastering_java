// simple class inherited and private members
package _1_Basics;
class basics1
{
  private int aa;
  int a ;
  int b;
  void show(int c , int d)
  {
    System.out.println(a+b+c+d);
  
  }

}

class basics extends basics1
{
  void show1()
  {
    System.out.println("subclass");
  
  }
  
  public static void main(String aa[])
  {
    basics1 b1 = new basics1();
    b1.show(5,6);
    
    basics bb1 = new basics();
    bb1.show(3,4);
    bb1.show1();
  
  }

}