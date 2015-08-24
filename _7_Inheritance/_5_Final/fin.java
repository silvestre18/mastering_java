package _5_Final;
final class fin1    // this class can not be extended
{
  fin1()
  {
    System.out.println("constructors1");
  
  }
  void show1()
  {
    System.out.println("method1");
  
  }
  
  int a;

}

class fin2
{
  final void show1()   // this can not be overriden
  {
    
     
  }
}

class fin3 
{
  final int a =3;

  void show()
  {
    
    System.out.println(a);
  
  }
  
}

class fin
{
  public static void main(String aa[])
  {
    final int b ;
    b=3;
    fin3 f = new fin3();
    f.show();
    
    
  
  }

}

