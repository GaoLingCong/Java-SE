import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;

/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
格式参照 {元素@元素@元素}。

System.out.println(list);       [10, 20, 30]
printArrayList(list);           {10@20@30}
 */
public class ArrayList按指定格式打印 {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("5");
        List.add("6");
        List.add("4");
        pintArrayList(List);

    }
    public static void pintArrayList(ArrayList<String> list)
    {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.print("@"+name);

        }
        System.out.print("}");

    }

}
