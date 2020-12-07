import java.util.Random;

import static java.lang.System.in;

public class 单词语法测试 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(RandomWords());
        }

    }
   public static String RandomWords(){
        String[] s = {"good","cheer","strive","optimistic","hello", "word","tercher", "student",
                "book","genius","handsome","beautiful","health","happy","exercice","computer",
                "english","jspanese","eat","me"};
       Random ram = new Random();
       int b =ram.nextInt(21);//随机数区间[0,20]
      return s[b];
    }
}
