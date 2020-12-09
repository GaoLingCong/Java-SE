
/*集合存取Person类 用Lambda表达式修改
*  Lambda表达式有参数有返回值的练习
    需求:
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序*/

import java.util.Arrays;
import java.util.Comparator;

public class Lambda表达式有参数有返回值练习 {
    public static void main(String[] args) {
    //使用数组存储多个Person对象
        Person[] arr = {
                new Person("啊到",32),
                new Person("啊傻",9),
                new Person("啊呆",23),
        };
        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序(前边-后边)排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 01-02;
            }
        });
        //使用Lambda表达式,简化匿名内部类
      Arrays.sort(arr,(Person o1,Person o2)->{
           return o1.getAge()-o2.getAge();
        });

        //优化省略Lambda表达式,
        Arrays.sort(arr,((o1, o2) ->o1.getAge()-o2.getAge()));
        for (Person person : arr) {
            System.out.println(person);
        }


    }
}
