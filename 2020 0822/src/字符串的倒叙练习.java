import java.util.Arrays;

/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class 字符串的倒叙练习 {
    public static void main(String[] args) {

        String [] array1 = {"a","c","b","d","f","y","g","o","w"};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("============================");
       // String array2 = "alkasdjasjdasdkasjdjasdiwqiubwbas";
        //Arrays.sort(array2);因为只有数组才能使用Arrays



        //如何进行升序？sort
        //必须数组，才能用Arrays.sort方法
        //String-》数组，用toCharArray
        String array2 = "alkasdjasjdasdkasjdjasdiwqiubwbas";
        char[] chars = array2.toCharArray();
        Arrays.sort(chars);//对字符数组进行升序排列
        //需要倒叙遍历
        //小技巧   chars.fori  是正序循环   chars.forr  倒叙循环
       /* for (int i = 0; i < chars.length; i++) {

        }*/
        System.out.println("倒叙输出");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);

        }
        System.out.println("正序输出");
        for (int i = 0; i < chars.length; i++) {

            System.out.print(chars[i]);
        }

    }
}
