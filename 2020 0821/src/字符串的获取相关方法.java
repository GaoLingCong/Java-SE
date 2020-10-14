/*
String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为 返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */
public class 字符串的获取相关方法 {
    public static void main(String[] args) {
  //获取字符串长度
        int length = "lsdkasjdkasjdsajdasjdasd".length();
        System.out.println("字符串的长度是"+length);
        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 =str1.concat(str2);  //因为字符串长度不可改变
        System.out.println("str1是"+str1);//Hello 不改变
        System.out.println("str2是"+str2);//World
        System.out.println("str3是"+str3);//HelloWorld
        System.out.println("==============================");
        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是"+ch);
        System.out.println("==================================");
        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果根本没有，返回值-1
        String A = "Hello";
        int llo = A.indexOf("llo");
        System.out.println("第一次索引值是"+llo);//2
        System.out.println("hello.world".indexOf("abc"));//因为找不到所以为-1
    }
}
