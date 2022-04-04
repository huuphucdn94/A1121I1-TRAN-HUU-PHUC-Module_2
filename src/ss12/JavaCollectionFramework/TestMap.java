package ss12.JavaCollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        //       sắp xếp key theo thứ tự giảm dần
       //        Map<String, Integer> hashMap = new TreeMap<>(new TestComparator());
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        //        treeMap để lưu key theo thứ tự tăng dần
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        treeMap.put("Smith", 30);
//        treeMap.put("Anderson", 31);
//        treeMap.put("Lewis", 29);
//        treeMap.put("Cook", 29);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\n the age for " +  "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
