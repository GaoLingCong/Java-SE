/*
==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：

public boolean equals(Object obj)：参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false。
注意事项：
1. 任何对象都能用Object进行接收。
2. equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
推荐："abc".equals(str)    不推荐：str.equals("abc")

public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较。
 */
public class 字符串的比较相关方法 {
    public static void main(String[] args) {
String stu1 = "Hello";
String stu2 = "Hello";
char [] charArray={'H','e','l','l','o'};
String stu3 = new String(charArray);
        System.out.println(stu1.equals(stu2));//true
        System.out.println(stu1.equals(stu2));//true
        System.out.println("Hello".equals(stu2));//true
        System.out.println(stu2.equals("Hello"));//true
String stu4 ="hello";
        System.out.println(stu1.equals(stu4));//false
        System.out.println("============================");
        String stu5 = null;
        System.out.println("abc".equals(stu5));//推荐  false
        //System.out.println(stu5.equals("abc"));//不推荐  false   空指针异常
String stuA = "Java";
String stuB = "java";
        System.out.println(stuA.equals(stuB));  //false严格区分大小写
        System.out.println(stuA.equalsIgnoreCase(stuB));  //true  忽略大小写  stuA.equalsIgnoreCase(stuB)
//注意只有英文字母区分大小写，其他不区分大小写
        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));//false+









    }
}
