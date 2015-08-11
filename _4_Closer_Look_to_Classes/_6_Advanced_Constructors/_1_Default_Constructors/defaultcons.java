/* This file will explain the use of default constructors */

class defaultcons
{
  // Sometimes a constructor is not defined , however , JVM creates a default constructor
  
  int a1;
  String s;
  /*  A constructor is not declared , but JVM makes this
  
  defaultcons()
  {
    super();      // this concept will be explained later
    a1 = 0;       // values by default
    s = null
  
  }

}