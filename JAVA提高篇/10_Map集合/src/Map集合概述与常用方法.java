import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<k,v>集合
    Map集合的特点:
        1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
        2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
        3.Map集合中的元素,key是不允许重复的,value是可以重复的
        4.Map集合中的元素,key和value是一一对应
    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表:查询的速度特别的快
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
        2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
   java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
   LinkedHashMap的特点:
        1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
        2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的

        map集合常用方法
1.   public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
            返回值:v
                存储键值对的时候,key不重复,返回值V是null
                存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值
2.    public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
            返回值:V
                key存在,v返回被删除的值
                key不存在,v返回null

3.
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
            返回值:
                key存在,返回对应的value值
                key不存在,返回null

 4.boolean containsKey(Object key) 判断集合中是否包含指定的键。
        包含返回true,不包含返回false

 */
public class Map集合概述与常用方法 {
    public static void main(String[] args) {
        PutMethod();
        System.out.println("**************");
        RemoveMthod();
        System.out.println("**************");
        GetMethod();
        System.out.println("**************");
        ContainskeyMethod();



    }

    private  static  void PutMethod()
    {
        //创建Map集合对象，多态
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("李晨","范冰冰");
        System.out.println("v1"+v1);//null

        String v2 = map.put("李晨","范冰冰2");
        System.out.println("v2"+v2);

        System.out.println(map);

        map.put(" 冷锋","龙小云");
        map.put(" 杨过","龙小云");
        map.put(" 君志平","龙小云");
        System.out.println(map);

    }
    private static void RemoveMthod(){
        //创建map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("赵里",168);
        map.put("杨因",158);
        map.put("啊道",178);
        System.out.println(map);


        Integer v1 = map.remove("赵里");
        System.out.println(v1);

        //为什么不用int  因为有可能会有空值null会发生NullPointerException
        //所以要使用Integer

        Integer v2 = map.remove("杨因");
        System.out.println(map);
    }
    private  static void GetMethod(){
        Map<String,Integer> map = new HashMap<>();
        map.put("啊到",1680);
        map.put("啊龙",15580);
        map.put("啊纯",165580);
        Integer v1 = map.get("啊纯");
        System.out.println(v1);
        Integer v2 = map.get("啊li");
        System.out.println(v2);//所以一定要用Integer接收，不然有空就会报错

    }
    private static void ContainskeyMethod(){
        Map<String,Integer> map = new HashMap<>();
        map.put("啊到",1680);
        map.put("啊龙",15580);
        map.put("啊纯",165580);

        boolean b1 = map.containsKey("啊到");
        System.out.println(b1);


        boolean b2 = map.containsKey("dasd");
        System.out.println(b2);

        //
        System.out.println("*********************");
        map.forEach((k,v)->
                System.out.println(k+v));



    }
}
