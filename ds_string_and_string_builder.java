public class ds_string_and_string_builder {

    /*

        1. If your string is not going to change use a String class because a String object is immutable.
        2. If you need to travere the string and often change it, use Char Array.

        3. If your string can change (example: lots of logic and operations in the construction of the string) 
           and will only be accessed from a single thread, using a StringBuilder is good enough.
        4. If your string can change, and will be accessed from multiple threads, use a StringBuffer 
           because StringBuffer is synchronous so you have thread-safety.

    */


    public static void string() {

        String s1 = "Hello, World";                 // initialise 
        String s2 = s1;                             // s2 is another reference to s1
        String s3 = new String(s1);                 // s3 is a copy of s1
        
        char[] char_array = {'a', 'b', 'c'};      
        String s4 = new String(char_array);         // convert char array to string
    
        if (s1.equals(s3)) { }                      // string comparison instead of "=="
    
        s1.compareTo(s3);                           // compare two strings lexicographically
        
        // Standard
        s1 += "!";                                   // concatenate, 1st method
        s1.length();                                 // length of the string
        s1.charAt(1);                                // returns char at the index

        s1.toCharArray();                            // convert the string to a char array
        s1.substring(6, 11);                         // get substring
        s1.isEmpty();                                // check if the string is empty

        s1.indexOf("hello");                         // find index of the char/string
        s1.lastIndexOf('o');                         // find last index of the char/string
    
        // Additional
        
        s1.trim();                                   // returns the string w/o whitespaces on sides
        s1.toLowerCase();                            // convert the string to lower case
        s1.toUpperCase();                            // convert the string to upper case
        s1.toString();                               // ???    
    }

    /*
    
    Immutable problem in Java:
    
    In Java, since the string is immutable, concatenation works by 
    first allocating enough space for the new string, copy the contents 
    from the old string and append to the new string.

    1. If you did want your string to be mutable, you can convert it to a char array.
    2. If you have to concatenate strings often, it will be better to use 
       some other data structures like StringBuilder. The below code runs in O(n) complexity.
            
       int n = 10000;
       StringBuilder str = new StringBuilder();
       for (int i = 0; i < n; i++) {
         str.append("hello");
       }
       String s = str.toString();

    */


    public static void string_builder() {
        // StringBuilder objects are like String objects, except that they can be modified
        // Thus, StringBuilder is used to create mutable strings in Java

        StringBuilder strBuilder = new StringBuilder();      // initialise 

        strBuilder.append("Hello");                          // concatenate
        strBuilder.insert(5, " World!");                     // insert string at specified index
        strBuilder.replace(6,7, "_");                        // replace from index to index by a string
        strBuilder.delete(6, 7);                             // delete from index to index


        strBuilder.reverse();                                // reverse the StringBuilder 
    }

}