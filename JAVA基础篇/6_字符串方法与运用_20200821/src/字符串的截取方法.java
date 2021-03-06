
/*
字符串的截取方法：

public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
备注：[begin,end)，包含左边，不包含右边。
 */public class 字符串的截取方法 {
    public static void main(String[] args) {

            String str1 = "  HelloWorld";
            String str2 =str1.substring(5);
        System.out.println("截取的字符串是"+str2);//World
        System.out.println(str1);//HelloWorld
        System.out.println("========================");
        String str3 = str1.substring(0,7 );
        System.out.println("截取0,4位置的字符串是"+str3);
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("=========================");


        //下面这种写法。字符串的内容仍然没有改变的
        //下面有两个字符串："Hello""java"
        //strA当中保存的是地址值
        //本来地址值是Hello的0X666;
        //后来地址值变成java的0x888;
        //变的是地址
        String stuA = "Hello";
        System.out.println(stuA);//Hello
        String stuB="java";
        System.out.println(stuB);//java

    }

}
