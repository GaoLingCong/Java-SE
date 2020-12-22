import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
          1.底层是一个链表结构:查询慢,增删快
          2.里边包含了大量操作首尾元素的方法
          注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */
public class LinkedList集合的特点和使用方法 {
     public static void main(String[] args) {
     show03();
     }




 /*
        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。此方法相当于 removeFirst
     */
private  static  void show03()
{
    //创建LinkedList集合对象
    LinkedList<String> linked = new LinkedList<>();
    //使用add方法往集合中添加元素
    linked.add("a");
    linked.add("b");
    linked.add("c");
    linked.add("d");
    linked.add("e");
    linked.add("f");
    linked.add("g");
    linked.add("h");
    System.out.println(linked);//[a,b,c]
    //- public E removeFirst():移除并返回此列表的第一个元素。
    //- public E removeLast():移除并返回此列表的最后一个元素。
    //- public E pop():从此列表所表示的堆栈处弹出一个元素。

    String S1 = linked.removeFirst();
    System.out.println("被移除的第一个元素"+S1);
    String S2 = linked.removeLast();
    System.out.println("被移除的最后一个元素"+S2);
    linked.pop();
    System.out.println(linked);//弹出的是被删除后的第一个

      //- public E getFirst():返回此列表的第一个元素。
      // - public E getLast():返回此列表的最后一个元素。
    System.out.println(linked.getFirst());
    System.out.println(linked.getLast());


    //linked.clear();//清空集合中的元素 在获取集合中的元素会抛出NoSuchElementException
    System.out.println(linked);
    System.out.println("***********************************8");

  /*
        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。
   */
    linked.addFirst("666");
    linked.addLast("888");
    linked.push("222");//将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E),推入前面第一个
    System.out.println(linked);

    //public boolean isEmpty()：如果列表不包含元素，则返回true。
    boolean a =  linked.isEmpty();
    System.out.println(a);


}

}
