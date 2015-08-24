class details1
{
  private int a=5;
  private void show1()
  {
    System.out.println("show1"+a);
  }
  void show11()
  {
    show1();
  
  }
  
  static void show11s()
  {
    System.out.println("static1");
  }
  
  void show111()
  {
    show11();
    System.out.println(b);
  
  }
  int b =7;

}

class details2 extends details1
{
  private int a =6;
  private void show1()
  {
    System.out.println("show2"+a);
  }
  
  void show11()
  {
    show1();
  }
  
  static void show11s()
  {
    System.out.println("static2");
  
  }
  
  void show1112()
  {
    show11();
    System.out.println(b);
  
  }
  
  int b =8;

}

class details
{
  public static void main(String aa[])
  {
    details1 d1 = new details1();
    details2 d2 = new details2();
    
    d1.show11();
    d2.show11();
    
    details2.show11s();
    
    d2.show1112();
    d2.show111();
    
  
  }

}