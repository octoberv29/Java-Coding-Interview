import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class data_structures {

  public static void array() {
    /*
      An array is a basic data structure to store a collection of elements sequentially.
      Each element in the array can be accessed by index.
    */

    // Array

    int[] a0 = new int[5];  // initialise, 1st method
    int[] a1 = {1,2,3};     // initialise, 2nd method

    int length = a1.length; // length
    int first = a1[0];      // access an element

    for (int i=0; i<length; ++i) { // iterating over the array, 1st method
      System.out.println(a1[i]);  
    }

    for (int item : a1) {          // iterating over the array, 2nd method
      System.out.println(item);
    }

    a1[1] = 4;               // modifying an element

    Arrays.sort(a1);         // sort using the standard Arrays library

  }

  public static void two_d_array() {
    
    int[][] a = new int[2][5];

    for (int i = 0; i < a.length; ++i) {
      System.out.println(a[i]);
    }

    for (int i = 0; i < a.length; ++i) {
      for (int j = 0; a[i] != null && j < a[i].length; ++j) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    
    int[][] b = new int[2][];
    b[0] = new int[3];
    b[1] = new int[5];
    
  }

  
  public static void arrayList() {
    /*
      An array has a fixed capacity and we need to specify the size of the array when we initialise it.
      Dynamic array (ArrayList) is an array with all its features (random access), but with variable size.
    */
 
    ArrayList<Integer> v0 = new ArrayList<>();  // initialise, 1st method
    ArrayList<Integer> v1;                      // initialise, 2nd method

    Integer[] a = {0, 1, 2, 3, 4};
    v1 = new ArrayList<>(Arrays.asList(a));     // cast an array to an ArrayList

    ArrayList<Integer> v2 = v1;                 // another reference to v1
    List<Integer> v3 = new ArrayList<>(v1);     // the actual copy fo v1

    int length = v1.size();                     // length(size) of the ArrayList

    int first = v1.get(0);                      // access an element

    for (int i=0; i<v1.size(); ++i) {           // iterate over the ArrayList, 1st method
      System.out.println(v1.get(i));            
    }

    for (int item : v1) {                       // iterate over the ArrayList, 2nd method
      System.out.println(item);            
    }

    // standard
    v1.set(0, 5);                               // modify element (set element)
    v1.get(0);                                  // access element (get element)
    v1.add(-1);                                 // add element at the end
    v1.add(1, 6);                               // add element at the specified position
    v1.remove(v1.size()-1);                     // delete the last element
    
    // additional
    v1.clear();                                 // removes all elements
    v1.contains(4);                             // check if object is in the ArrayList
    v1.indexOf(4);                              // returns the index of the object
    v1.isEmpty();                               // check if the ArrayList is empty
    v1.remove(1);                               // remove element by index
    v1.subList(1, 3);                           // subList from index to index of the initial ArrayList
    v1.toArray();                               // makes an array from the ArrayList


    Collections.sort(v1);                       // sort using the standard Collection library

  }


  public static void string() {

    String s1 = "Hello, World";                 // initialise 
    String s2 = s1;                             // s2 is another reference to s1
    String s3 = new String(s1);                 // s3 is a copy of s1

    if (s1.equals(s3)) {                        // string comparison instead of "=="
      System.out.println("YES");
    }

    s1.compareTo(s3);                           // compare two strings lexicographically
    
    // Standard
    s1 += "!";                                   // concatenate, 1st method
    s1.length();                                 // length of the string
    s1.charAt(1);                                // returns char at the index
    s1.indexOf('o');                             // find index of the char
    s1.lastIndexOf('o');                         // find last index of the char
    s1.isEmpty();                                // check if the string is empty

    // Additional
    s1.toCharArray();                            // convert the string to a char array
    s1.toLowerCase();                            // convert the string to lower case
    s1.toUpperCase();                            // convert the string to upper case
    s1.trim();                                   // returns the string w/o whitespaces on sides
    s1.toString();                               // ???

    s1.substring(6, 11);                         // get substring

    // Immutable problem in Java:

    // In Java, since the string is immutable, concatenation works by 
    // first allocating enough space for the new string, copy the contents 
    // from the old string and append to the new string.

    // 1. If you did want your string to be mutable, you can convert it to a char array.
    // 2. If you have to concatenate strings often, it will be better to use 
    //    some other data structures like StringBuilder. The below code runs in O(n) complexity.
          
    //    int n = 10000;
    //    StringBuilder str = new StringBuilder();
    //    for (int i = 0; i < n; i++) {
    //      str.append("hello");
    //    }
    //    String s = str.toString();

  }


  public static void two_pointer_technique() {
    /*
      Two-Pointer Technique:

      1. We can use two pointers at the same time to do the iteration: 
         one starts from the first element and another starts from the last element.

         We can use this, for example, to swap first and last elements in the array.
         
         // int[] v, int N
         int i = 0;
         int j = N - 1;
         while (i < j) {
             int temp = v[i];
             v[i++] = v[j];
             v[j--] = temp;
         }

      2. We can also use two pointers with different steps to solve problems.

         We can use this for "Given an array and a value, remove all instances 
         of that value in-place and return the new length."
         - One pointer is still used for the iteration while
           the second one always points at the position for next addition.
         
         // int[] nums, int val
         int k = 0;
         for (int i = 0; i < nums.length; ++i) {
             if (nums[i] != val) {
                 nums[k] = nums[i];
                 k++;
             }
         }

    */
  }
  
}
