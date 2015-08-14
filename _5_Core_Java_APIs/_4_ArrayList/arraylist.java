/* This file will explain everything about ArrayLists */
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
class arraylist
{
  public static void main(String aa[])
  {
    // There are some ways to create ArrayList
    
    ArrayList <String> als = new ArrayList <>();        // capacity of 10
    ArrayList <Integer> ali = new ArrayList<Integer>(); // capacity of 10
    ArrayList <Double> ald = new ArrayList<Double>(20); // capacity of 20
    ArrayList <Double> ald2 = new ArrayList<>(ald);
    ArrayList <Short> alsh = new ArrayList<>();
    
    alsh.add((short)23);
    alsh.add(1,(short)45);
    System.out.println(alsh);
    
    als.add("jim");
    als.add("elizabeth");
    System.out.println(als);
    als.remove("elizabeth");
    als.remove(0);
    System.out.println(als);
    System.out.println(als.size());
    
    als.add("milagrito");
    als.set(0,"leonardito");
    System.out.println(als);
    
    System.out.println(als.isEmpty());  // false
    System.out.println(als.size());     // 1
    
    System.out.println(als.contains("leonardito"));  // true
    
    
    System.out.println(als.get(0));
    
    // We can create a list from an ArrayList
    
    List <String> ls = new ArrayList<>();
    List <Integer> li = new ArrayList<>();
    
    
    // Converting between array and list and viceversa
    
    // from list or ArrayList to array
    
    
    Short s[] = alsh.toArray( new Short[3]);
    System.out.println(s[2]);
    
    
    // from an array to list
    
    List <Short> ls2 = Arrays.asList(s);
    ls2.set(2,(short)17);
    
    Collections.sort(ls2);

    
   
    
    System.out.println(ls2);
    
    // Sorting
    

    
    
    /*
    
    
    
    
    
    
    
  
  
    ArrayList <String> al1 = new ArrayList<>();   
    ArrayList <Integer> al2 = new ArrayList<Integer>();
    ArrayList <Boolean> al3 = new ArrayList<>();
    ArrayList <Short> al4 = new ArrayList<>();
    ArrayList <Long> al5 = new ArrayList<>();
    ArrayList <String>al6 = al1;
    

    al1.add("jim");
    al2.add(45);
    al3.add(true);
    al4.add((short)23);
    al5.add(34l);
    al1.add(0,"elizabeth");
    System.out.println(al1);
    System.out.println(al2);
    System.out.println(al3);
    
    
    al1.remove("jim");
    System.out.println(al1);
    
    al2.add(1,234);
    al2.remove(0);
    System.out.println(al2);
    
    al1.add("elizabeth");
    al1.set(0,"leonardito");
    System.out.println(al1);
    
    System.out.println(al1.isEmpty());
    System.out.println(al1.size());
    
    al6.clear();
    System.out.println(al1);
    
    System.out.println(al3.contains(true));
    
    
    List <String> ld1 = new ArrayList<String>();
    List <Integer> li1 = new ArrayList<Integer>();
    
    ArrayList <Double> ld2 = new ArrayList<Double>();
    
    ld2.add(23.4);
    ld1.add("jim");
    ld1.add("elizabeth");
    ld1.add("leonardito");
    li1.add(23);
    
    Double d2[] = ld2.toArray(new Double[0]);
    Integer i1[] = li1.toArray(new Integer[0]);
    String d1[] = ld1.toArray(new String [2]);
    
    System.out.println(d1[2]);
    

    ArrayList <Integer> li2 = Arrays.List(i1);
    
    
  */
  }

}