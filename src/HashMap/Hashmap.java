import java.net.InterfaceAddress;
import java.util.*;



public class Hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> thing=new HashMap<>();
        //the first one is key and the key is unique.
        //the second one is the value in which may or may not differ.

        thing.put("Siddhartha", 5000984);
        //put helps in storing the values
        thing.put("name", 5000926);

        thing.put("object2",500984221);
        thing.put("object3",5009954);
       System.out.println(thing);
        System.out.println("size of this is "+thing.size());
        //gives the size indexing is 1,2,3.......

        //to check if the key is present or not we use  "containsKey" function
        if(thing.containsKey("name")){
            Integer value=thing.get("name");
            System.out.println("the value of the searched key is "+value);
        }

        //let's search from the user this time
        System.out.println("please enter the key to be searched  ");
        String s=sc.nextLine();
        if(thing.containsKey(s));{
        Integer a=thing.get("name");
        System.out.println("the value of the seached key is "+a);}

            thing.get(s);
        }
//follows:
//
// 1   HashMap()    =>done =>Syntax is"" HashMap<K, V> hm = new HashMap<K, V>();""
//  2  HashMap(int initialCapacity)
//    3 HashMap(int initialCapacity, float loadFactor)
//      4HashMap(Map map)









    }
