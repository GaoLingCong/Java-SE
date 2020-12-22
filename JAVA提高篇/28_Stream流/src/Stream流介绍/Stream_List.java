package Stream流介绍;

import java.util.ArrayList;
import java.util.List;

/*
    使用传统的方式,遍历集合,对集合中的数据进行过滤
 */
public class Stream_List {
    public static void main(String[] args) {
        //创建一个List集合,存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        //对list集合中的元素进行过滤,只要以张开头的元素,存储到一个新的集合中
        ArrayList<String> list1 = new ArrayList<>();
        for (String s:list) {
            if(s.startsWith("张")){
                list1.add(s);
            }


        }
        //对listA集合进行过滤,只要姓名长度为3的人,存储到一个新集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length()==3){
                list2.add(s);
            }
        }
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
