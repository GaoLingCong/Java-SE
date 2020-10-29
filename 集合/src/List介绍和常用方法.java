import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.List接口 extends Collection接口
    List接口的特点:
        1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
        2.有索引,包含了一些带索引的方法
        3.允许存储重复的元素

    List接口中带索引的方法(特有)
        - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        - public E get(int index):返回集合中指定位置的元素。
        - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
    注意:
        操作索引的时候,一定要防止索引越界异常
        IndexOutOfBoundsException:索引越界异常,集合会报
        ArrayIndexOutOfBoundsException:数组索引越界异常
        StringIndexOutOfBoundsException:字符串索引越界异常



      扩展：

       特点：查询快增删慢
      `java.util.ArrayList`集合数据存储的结构是数组结构。元素增删慢，查找快，底层原理是一个数组，通过复制来完成数据的增删
      由于日常开发中使用最多的功能为查询数据、遍历数据，所以`ArrayList`是最常用的集合，是一个多线程
 */
public class List介绍和常用方法 {
    public static void main(String[] args) {

        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("s");
        list.add("g");
        list.add("c");
        list.add("b");
        list.add("a");
        System.out.println(list);//打印的不是地址，重写了toString

        //public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        //在a和s之间添加一个itheima
        list.add(1,"heima");
        System.out.println(list);


        //public E remove(int index): 移除列表中指定位置的元素, 注意返回的是被移除的元素。
        //移除元素

        String a = list.remove(1);//删除返回的是删除的值
        System.out.println(a);
        System.out.println(list);


        //public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        //把最后一个a,替换为A

        list.set(1,"GLC加油啊");
        System.out.println(list);

        list.set(2,"记住猛兽总是独行！");
        System.out.println("***************************8");
        //list集合的遍历的三种方法
        //使用普的for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("***************");
        //使用迭代器
        Iterator<String> it = list.iterator();
        //再用while
        while (it.hasNext())//it.hasNext是用来判断集合当中有没有元素了
        {
           String s =  it.next();//获取每一个元素
            System.out.println(s);
        }
        System.out.println("***************");
        //使用增强for循环遍历
        for (String s:list) {
            System.out.println(s);
        }



    }
}
