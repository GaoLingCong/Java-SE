/*
    泛型的通配符:
        ?:代表任意的数据类型
    使用方式:
        不能创建对象使用
        只能作为方法的参数使用
 */

import java.util.ArrayList;
import java.util.Iterator;

public class 泛型的通配符 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("132");
        for (Integer a: list1
             ) {
            System.out.println(a);
        }
        /*
        * 如果今天我偷懒了，就不是我了，我要做回我自己，我做什么事都要尽力这才是我
        * 这叫尽人事听天命
        * */


      /*
        定义一个方法,能遍历所有类型的ArrayList集合
        这时候我们不知道ArrayList集合使用什么数据类型,可以泛型的通配符?来接收数据类型
        注意:
            泛型没有继承概念的
            只能用来传参数不能存储

     */
    }
    public static void printArray(ArrayList<?> list) //加通配符
    {
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext())
        {

            //***it.next()方法,取出的元素是Object,可以接收任意的数据类型
          Object o =  it.next();
            System.out.println(o);
        }

    }



}
