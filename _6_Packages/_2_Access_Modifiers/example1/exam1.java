package example1;

public class exam1
{
  private int a1 =3;
  protected int a2 = 4;
  public int a3 =5;
  int a4 =6;
  
  protected void method1()
  {
    System.out.println("protected");
  
  }
  
  public static void main(String a[])
  {
    exam1 e = new exam1();
    e.method1();
    System.out.println(e.a2);
  
  }


}
