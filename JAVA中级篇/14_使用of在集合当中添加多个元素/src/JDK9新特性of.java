/*
    JDK9的新特性:
        List接口,Set接口,Map接口:里边增加了一个静态的方法of,可以给集合一次性添加多个元素
        static <E> List<E> of​(E... elements)
        使用前提:
            当集合中存储的元素的个数已经确定了,不在改变时使用
     注意:
        1.of方法只适用于List接口,Set接口,Map接口,不适用于接接口的实现类
        2.of方法的返回值是一个不能改变的集合,集合不能再使用add,put方法添加元素,会抛出异常
        3.Set接口和Map接口在调用of方法的时候,不能有重复的元素,否则会抛出异常
 */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JDK9新特性of {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","d","e");
        System.out.println(list);
        //of方法返回的是一个不能改变的集合，所以不能再继续使用add方法

        Set<String> set = Set.of("a","b","c");
        System.out.println(set);
        //set.add("w");//UnsupportedOperationException:不支持操作异常


        Map<String,Integer> map = Map.of("张三",12,"啊高",20,"里无",21);
        System.out.println(map);



    }
}
