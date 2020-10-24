/*
        分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

        注意事项：
        split方法的参数其实是一个“正则表达式”，今后学习。
       *
分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

注意事项：
split方法的参数其实是一个“正则表达式”，今后学习。
今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）
 */

public class 字符串分割方法 {
    public static void main(String[] args) {

        String stu1 = "aaa,bbb,ccc";
        String[] stu2 = stu1.split(",");  //按逗号切割
        for (int i = 0; i < stu2.length; i++) {
            System.out.println(stu2[i]);

        }
        System.out.println("=================");
        String stu3 = "aaa bbb ccc";
        String[] stu4 = stu3.split(" ");//按空格切割
        for (int i = 0; i < stu4.length; i++) {
            System.out.println(stu4[i]);
        }
        System.out.println( "========================= ");
       String stu5 ="aaa.bbb.ccc";
        String[] stu6 = stu5.split("\\.");// .分割要用 \\. 今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）

        for (int i = 0; i < stu6.length; i++) {
            System.out.println(stu6[i]);

        }


    }

}
