import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class 随机出单词 {
    public static void main(String[] args) {

   String S =randomWord();
        System.out.println(S);





    }

    public static String randomWord() {
        int length = 12 + (int) (Math.random() * 9);
        String word = "";
        for (int i = 0; i < length; i++) {
            word += (char) randomChar();
        }
        return word;
    }

   public static byte randomChar() {
        int flag = (int) (Math.random() * 2);// 0小写字母1大写字母
        byte resultBt;
        if (flag == 0) {
            byte bt = (byte) (Math.random() * 26);// 0 <= bt < 26
            resultBt = (byte) (65 + bt);
        } else {
            byte bt = (byte) (Math.random() * 26);// 0 <= bt < 26
            resultBt = (byte) (97 + bt);
        }
        return resultBt;
    }

   /* public static String[] words(int a, int b) {
        String[] words = {};
        if (a > 0 && b > 0) {
            words = new String[a];
            String[] red = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                    "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            for (int i = 0; i < a; i++) {
                String word = " ";
                //随记单词的长度
                int randb = new Random().nextInt(b);//最大单词数现在
                for (int j = 0; j <= randb; j++) {
                    int randa = new Random().nextInt(26);
                    //随记单词的一个字母
                    if (j == 0) {
                        word = red[randa];
                    } else {
                        word += red[randa];
                    }
                }
                words[i] = word;
            }
            for (int i = 0; i < words.length; i++) {
                if (i == 0) {

                   System.out.print(words[i]);
                } else {
                  System.out.print("," + words[i]);
                }
            }
        }

    }*/

}



