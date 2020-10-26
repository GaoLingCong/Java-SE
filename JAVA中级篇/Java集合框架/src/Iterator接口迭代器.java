/*
        java.util.Iterator接口:迭代器(对集合进行遍历)
        有两个常用的方法
        boolean hasNext() 如果仍有元素可以迭代，则返回 true。
        判断集合中还有没有下一个元素,有就返回true,没有就返回false
        E next() 返回迭代的下一个元素。
        取出集合中的下一个元素
        Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
        Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
        Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

        迭代器的使用步骤(重点):
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
        */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator接口迭代器 {
    public static void main(String[] args) {
        //创建一个对象
        Collection<String> coll= new ArrayList<>();
        //往集合添加元素
        coll.add("易建联");
        coll.add("徐杰");
        coll.add("任骏飞");
        coll.add("胡明轩");
        coll.add("赵睿");
        /*
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        注意:
        Iterator<E>接口也是有泛型的,迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型
         */
        //多态  接口            实现类对象
        Iterator<String> it = coll.iterator();
        //2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        boolean b = it.hasNext();
        //3.使用Iterator接口中的方法next取出集合中的下一个元素
        String s = it.next();
        System.out.println(s);
        it.remove();
//      删除最近一次已近迭代出出去的那个元素。
//     只有当next执行完后，才能调用remove函数。
//     比如你要删除第一个元素，不能直接调用 remove()   而要先next一下( );
//     在没有先调用next 就调用remove方法是会抛出异常的。
//     这个和MySQL中的ResultSet很类似
//        void remove()
 //       {//          throw new UnsupportedOperationException("remove");
  //      }
        System.out.println("**************************");
        b = it.hasNext();//判断还有没有下一个元素
        System.out.println(b);
        s = it.next();//使用next取出集合中的下一个元素
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

       /* b = it.hasNext();
        System.out.println(b);//没有元素,返回false
        s = it.next();//没有元素,在取出元素会抛出NoSuchElementException没有元素异常
        System.out.println(s);*/



         /*
            发现使用迭代器取出集合中元素的代码,是一个重复的过程
            所以我们可以使用循环优化
            不知道集合中有多少元素,使用while循环,知道时有for循环
            循环结束的条件,hasNext方法返回false
         */
        while (it.hasNext()){//判断还有没有下一个元素

            String e = it.next();//获取下一个元素
            System.out.println(e);
        }

        System.out.println("----------------------");
         //增强for循环
        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            String e = it2.next();
            System.out.println(e);
        }



    }

}
