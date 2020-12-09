import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */
public class HashMapSavePerson {
    public static void main(String[] args) {
        /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复
     */

method1();
method2();

    }
    private static void method1(){
        //创建HashMap集合
        HashMap<Person,String> map = new HashMap<>();
        //往集合当中添加元素
        map.put(new Person("女王",18),"英国");
        map.put(new Person("请始皇·",323),"中国");
        map.put(new Person("普京",44),"俄罗斯");
        map.put(new Person("女王",18),"啊道国");
        //使用entrySet和增强for遍历Map集合
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for (Map.Entry<Person,String> entry :set)
        {
            Person key = entry.getKey();
            String value= entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }


 /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals方法,可以保证key唯一
        value:Person类型
            value可以重复(同名同年龄的人视为同一个)
     */

private static void method2() {
    //创建HashMap集合
    HashMap<String, Person> map = new HashMap<>();
    //往集合当中添加元素
    map.put("北京", new Person("张三", 15));
    map.put("上海", new Person("张④", 22));
    map.put("广州", new Person("张无", 145));
    map.put("北京", new Person("张六", 156));
    Set<String> set = map.keySet();
    for (String key : set) {
        Person value = map.get(key);
        System.out.println(key + value);

    }
}
}