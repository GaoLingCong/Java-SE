/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

     Comparator和Comparable的区别
        Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判,比较两个

    Comparator的排序规则:
        o1-o2:升序
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 集合排序方法2 {
    public static void main(String[] args) {
        //1. 先看这个 用集合添加数字排序的方法
        ArrayList<Integer> list1 = new ArrayList<>();//创建集合
        list1.add(1);//用add往集合添加元素
        list1.add(3);
        list1.add(2);
        System.out.println(list1);//打印集合
        //重写排序规则比较规则  就是可以按自己意思来排序 前面减后面就升序排列  后 减前就是降序排列
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { //
//                return 01-02;// 升序
                return o2-o1;//降序
            }
        });
        System.out.println(list1);

        //下面这个就是用集合存储Student类  你的是A 就存A
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("a迪丽热巴",18)); //add方法添加元素给集合
        list2.add(new Student("古力娜扎",20));
        list2.add(new Student("杨幂",17));
        list2.add(new Student("b杨幂",15));

        //重写排序方法，按年龄排序  可以自己修改自己想怎么排就怎么排
        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();//升序
            }
        });
        System.out.println(list2);





        //扩展高级条件排序，了解就可以了
        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按年龄升序排序
                int result = o1.getAge() - o2.getAge();
                //如果两个人的名字相同，在使用姓名的第一个字进行比较
                if(result == 0)
                {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
    }

}
