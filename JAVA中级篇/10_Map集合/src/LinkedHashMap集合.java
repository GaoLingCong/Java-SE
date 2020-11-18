import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> entends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class LinkedHashMap集合 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        map.put("a","c");
        System.out.println(map);// key不允许重复,无序 {a=d, b=b, c=c}


        LinkedHashMap<String,String> liked = new LinkedHashMap<>();
        liked.put("a","a");
        liked.put("c","c");
        liked.put("b","b");
        liked.put("a","d");
        liked.put("e","a");
        System.out.println(liked);// key不允许重复,有序 {a=d, c=c, b=b}
    }

}
