import java.util.ArrayList;

/*
ArrayList当中的常用方法有：

public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其他集合（今后学习）来说，add添加动作不一定成功。

public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。

public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */public class ArrayList集合常用方法和集合的遍历 {
    public static void main(String[] args) {

        ArrayList<String> list  = new ArrayList<>();
        //这一部分用来判断是否添加成功add一定成功  以后用
        boolean B = list.add("高灵聪");
        System.out.println("是否添加成功"+B);
        System.out.println(list);

        list.add("高灵聪");
        list.add("古力娜扎");
        list.add("迪丽热巴");
        System.out.println(list);
        System.out.println("------------------------------------------------");
         String A = list.get(3); //list.get()获取第三号元素
        System.out.println("从集合中获取的第三号元素是"+A);
        String C =list.remove(3);//list.remove(3)删除第三号元素的值
        System.out.println("要删除第三号元素是"+C);
        System.out.println(list);
        int D =list.size();//获取集合长度 和数组array.length一样
        System.out.println("获取集合的长度是"+D);

   }
}
