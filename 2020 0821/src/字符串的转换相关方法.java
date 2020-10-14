
/*
String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
备注：CharSequence意思就是说可以接受字符串类型。
 */
public class 字符串的转换相关方法 {
    public static void main(String[] args) {
        //转换为字符数组

        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//5  //长度
        System.out.println("===================");
        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        System.out.println(bytes[0]);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===================================================");
        //替换新字符
        String stu1 = "How do you do ?"; //把所有的o替换*；
        String stu2 = stu1.replace("o", "*");//因为字符不能改变长度，构造了一个新的字符就要新的stu2来接收新字符
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println("===================================================");
         String stu3=("你大爷的，你会不会玩？你大爷的！你大爷的！！，你大爷的！！！！");
        String stu4 = stu3.replace("你大爷的", "****");
        System.out.println(stu4);


    }

}
