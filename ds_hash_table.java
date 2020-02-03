import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ds_hash_table {

  public static void hash_set() {
    /*
      HashSet is a data structure to store no repeated values.

      1. Typically, a hash set is used to check if a value has ever appeared or not.

         Because it is easy and effective to insert a new value and 
         check if a value is in a hash set or not.

    */

    HashSet<Integer> set = new HashSet<>();  // initialise
    
    // Standard
    set.add(2);                              // add a new key
    set.remove(2);                           // remove a key
    set.size();                              // size of the hashset
    set.clear();                             // clear the hashset
    set.isEmpty();                           // check if the hashset is empty
    set.contains(2);                         // check if the key is in the hashset

    for (Integer i : set) {                  // iterate over the set, 1st method
      System.out.println(i);
    }
      
  }

  public static void hash_map() {
    /*
      HashMap is used to store (key, value) pairs.

      1. Used when we need more information rather than only the key. 
      
         Then we can build a mapping relationship between key and information by hash map.

      2. Used when we need to aggregate all the information by key.
      
         For example, count the number of occurrence, and then go through the results to 
         find out the first unique character.
         
    */

    HashMap<Integer, Integer> map = new HashMap<>();              // initialise

    map.putIfAbsent(0, 0);                    // insert a new (key, value) pair
    map.put(1,1);                             // insert a new (key, value) pair or update the existed key
    map.get(1);                               // get the value of the key
    map.remove(1);                            // remove the key form the hashmap
    map.containsKey(2);                       // check if a key is in the hashmap
    map.clear();                              // clear the map
    map.isEmpty();                            // check if the hashmap is empty

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {    // iterate the hashmap
      System.out.print(entry.getKey() + entry.getValue());
    }
  }
}