/* This file will explain when objects are accessible */

class access
{
  void method1()
  {
  // When a created object is initializing again , a new object is born 
  access a = new access ();  // An object of class access whose reference is a has been created
  
  a= new access();          // A new object is created , an the former one became inaccessible
  
  // When a reference is set to null , the object stops being accessible
  
  a = null ;               // the object became inaccessible
  
  // When an object is out of scope
  {
    // this objects is created inside {} , so outside , it will not be accessible
    access a1 = new access();  // An object of class access whose reference is a1 has been created
  }
  
  
  }
  
}
  
}
