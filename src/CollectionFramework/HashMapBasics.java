package CollectionFramework;
import java.util.*;
public class HashMapBasics {
    //map = collection of key-value pairs, unique key
 public static void main(String[] args) {
     Map<String,String> map = new HashMap<>();
     //insertion
     map.put("in" ,"India");
     map.put("en" ,"England");
     map.put("un" ,"United States");

     System.out.println(map);

     Map<String,String> map2 = new HashMap<>();
     map2.put("br" ,"Brazil");
     System.out.println("Before: " +map2);
     map2.putAll(map);
     System.out.println("After: " +map2);

     //deletion
     map2.remove("en");
     System.out.println(map2);
//     System.out.println(map2.size());
//     //map2.clear();
//     System.out.println(map2);
      //putIfAbsent - also update
     map2.putIfAbsent("is" ,"India3");
     System.out.println(map2);
     //get
     System.out.println(map2.get("br"));

     //getordefault
     System.out.println(map2.getOrDefault("use","NONE"));
     //containskey,value
     System.out.println(map2.containsKey("en"));
     System.out.println(map2.containsValue("India"));
     System.out.println(map2);
     //replace
     System.out.println(map2.replace("in", "Indonesia"));
     System.out.println(map2);
     //key set
     Set<String> str = map2.keySet();
     System.out.println(str);
     //value set
     Collection<String> str1 = map2.values();
     System.out.println(str1);
     //get all the entries from map
     Set<Map.Entry<String, String>> set = map2.entrySet();
     System.out.println(set);
 }

}
