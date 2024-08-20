package maps;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // define hashmap
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();

        // adding element into map
        map1.put(101,"Mango");
        map1.put(102,"Grapes");
        map1.put(103,"Apple");
        map1.put(104,"Grapes");
        map1.put(103,"Guava");//overrides apple and prints guava
        map1.put(102,"Banana");// overrides grapes and prints banana
        map1.put(105,"Banana");
        map1.put(105,"Orange");// overirdes banana and prints organe
        System.out.println("map1 is : "+map1);
    }
}
