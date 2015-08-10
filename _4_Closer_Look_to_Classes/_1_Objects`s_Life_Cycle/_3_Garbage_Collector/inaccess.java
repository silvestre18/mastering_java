/* The concept of garbage collector is important for inaccessible objects */
class inaccess
{
  /* The concept of garbage collection means that the JVM will free the memory of objects
     which are not accessible anymore , however , the JVM will do that in any moment ,
     we can not know when the garbage collection will act , we only can know what objects are
     elegible for garbage collection */

  // there is a method called finalize which act just before the garbage collection acts
  // This method will appear when garbage collection appears , if garbage collection fails
  // the finalize method wont be called again
  protected void finalize()
  {
    System.out.println("The garbage collection has appeared ");
  
  }
  
  /***************EXTRA CONCEPTS***************/
  
  // The method finalize must be in the class we want to use the garbage collection
  
  // there is method called System.gc(); which tells java that the garbage collection can appear
  // JVM can ignore that request
  
  void method1()
  {
    System.gc();  // JVM can ignore this request
  
  }
  


}