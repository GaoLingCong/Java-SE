import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
 */
public class 集合添加多个元素和排序的方法 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //常规添加
        list.add("1");
        list.add("2");
        list.add("3");
        ArrayList<String> list1 = new ArrayList<>();
        // //public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一
        Collections.addAll(list1,"a","b","c","e","f");
        System.out.println(list1);


        //public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        Collections.shuffle(list1);
        System.out.println(list1);


        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person("张三",12));
        list3.add(new Person("张虎",14));
        list3.add(new Person("张像",17));
        System.out.println("没有改变前"+list3);

        Collections.sort(list3);
        System.out.println("类中实现Comparable<Person >接口并重写排序方法后"+list3);


    }
}
