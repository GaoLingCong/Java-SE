import java.util.ArrayList;
import java.util.Collections;

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
 */
public class 集合排序的方法1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1  = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        Collections.sort(list1);
        System.out.println(list1);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("c");
        list2.add("d");
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

    }
}
